package shop.service.room;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import shop.model.Room;
import shop.model.dto.room.RoomRequest;
import shop.model.dto.room.RoomResponse;
import shop.repository.RoomRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    @Override
    public RoomResponse createRoom(RoomRequest request) {
        Room room = Room.builder()
                .roomName(request.getRoomName())
                .build();

        room = roomRepository.save(room);

        return RoomResponse.builder()
                .roomName(room.getRoomName())
                .build();
    }

    @Override
    public List<RoomResponse> getRooms() {
        List<RoomResponse> rooms = new ArrayList<>();
        for (Room room : roomRepository.findAll()) {
            rooms.add(
                    RoomResponse.builder()
                            .roomName(room.getRoomName())
                            .build()
            );
        }
        return rooms;
    }
}
