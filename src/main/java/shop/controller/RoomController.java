package shop.controller;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.model.dto.room.RoomRequest;
import shop.model.dto.room.RoomResponse;
import shop.service.room.RoomService;

import java.util.List;

@RestController
@RequestMapping("/room")
@RequiredArgsConstructor
@Slf4j
public class RoomController {

    private final RoomService roomService;
//    consumes
//    MediaType.APPLICATION_FORM_URLENCODED_VALUE = UNITY
//    MediaType.APPLICATION_JSON_VALUE = WEB/MOBILE
    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    @SneakyThrows
    public ResponseEntity<RoomResponse> createRoom(@RequestBody final RoomRequest request){

        return ResponseEntity.ok(roomService.createRoom(request));
    }

    @GetMapping
    @SneakyThrows
    public ResponseEntity<List<RoomResponse>> getRooms(){

        return ResponseEntity.ok(roomService.getRooms());
    }
}
