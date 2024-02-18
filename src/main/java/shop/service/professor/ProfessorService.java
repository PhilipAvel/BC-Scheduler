package shop.service.professor;

import shop.model.dto.professor.ProfessorRequest;
import shop.model.dto.professor.ProfessorResponse;

public interface ProfessorService {

    ProfessorResponse createProfessor(ProfessorRequest request);

}
