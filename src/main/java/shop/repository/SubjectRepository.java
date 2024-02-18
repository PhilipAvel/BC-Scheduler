package shop.repository;

import org.springframework.data.repository.CrudRepository;
import shop.model.Subject;

public interface SubjectRepository extends CrudRepository <Subject, Long>{

    Subject findBySubjectName(String subjectName);
}
