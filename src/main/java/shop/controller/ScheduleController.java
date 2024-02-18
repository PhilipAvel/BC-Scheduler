package shop.controller;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.model.dto.room.RoomResponse;
import shop.model.dto.schedule.ScheduleRequest;
import shop.model.dto.schedule.ScheduleResponse;
import shop.service.schedule.ScheduleService;

import java.util.List;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
@Slf4j
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping(value = "/createDateAndTime", consumes = MediaType.APPLICATION_JSON_VALUE)
    @SneakyThrows
    public ResponseEntity<ScheduleResponse> createDateAndTime(@RequestBody final ScheduleRequest request){

        return ResponseEntity.ok(scheduleService.createDateAndTime(request));
    }

    @GetMapping
    @SneakyThrows
    public ResponseEntity<List<ScheduleResponse>> getSchedule(){

        return ResponseEntity.ok(scheduleService.getSchedule());
    }
}
