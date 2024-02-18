package shop.service.schedule;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import shop.model.Room;
import shop.model.Schedule;
import shop.model.dto.room.RoomResponse;
import shop.model.dto.schedule.ScheduleRequest;
import shop.model.dto.schedule.ScheduleResponse;
import shop.repository.ScheduleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Override
    public ScheduleResponse createDateAndTime(ScheduleRequest request) {
        Schedule schedule = Schedule.builder()
                .date(request.getDate())
                .time(request.getTime())
                .build();

        schedule = scheduleRepository.save(schedule);

        return ScheduleResponse.builder()
                .date(schedule.getDate())
                .time(schedule.getTime())
                .build();
    }

    @Override
    public List<ScheduleResponse> getSchedule() {
        List<ScheduleResponse> schedules = new ArrayList<>();
        for(Schedule schedule : scheduleRepository.findAll()){
            schedules.add(
                    ScheduleResponse.builder()
                            .date(schedule.getDate())
                            .time(schedule.getTime())
                            .build()
            );
        }
        return schedules;
    }
}
