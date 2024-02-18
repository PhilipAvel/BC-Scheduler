package shop.repository;

import org.springframework.data.repository.CrudRepository;
import shop.model.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Long> {

    Professor findByFirstName(String profFirstName);
}
