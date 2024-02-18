package shop.service.room;

import shop.model.dto.room.RoomRequest;
import shop.model.dto.room.RoomResponse;

import java.util.List;

public interface RoomService {

    RoomResponse createRoom(RoomRequest request);

    List<RoomResponse> getRooms();
}
