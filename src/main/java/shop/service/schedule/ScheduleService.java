package shop.service.schedule;

import shop.model.dto.schedule.ScheduleRequest;
import shop.model.dto.schedule.ScheduleResponse;

import java.util.List;

public interface ScheduleService {

    ScheduleResponse createDateAndTime(ScheduleRequest request);

    List<ScheduleResponse> getSchedule();
}
