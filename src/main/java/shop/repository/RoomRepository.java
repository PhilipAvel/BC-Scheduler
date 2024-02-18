package shop.repository;

import org.springframework.data.repository.CrudRepository;
import shop.model.Room;


public interface RoomRepository extends CrudRepository<Room, Long>{

    Room findByRoomName(String roomName);
}
