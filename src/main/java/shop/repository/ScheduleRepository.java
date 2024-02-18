package shop.repository;

import org.springframework.data.repository.CrudRepository;
import shop.model.Schedule;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {

    Schedule findByProfessorIdEquals(Long profId);
}
