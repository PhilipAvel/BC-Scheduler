package shop.service.professor;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import shop.model.Professor;
import shop.model.dto.professor.ProfessorResponse;
import shop.model.dto.professor.ProfessorRequest;
import shop.repository.ProfessorRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProfessorServiceImpl implements ProfessorService{

    private final ProfessorRepository professorRepository;

    @Override
    public ProfessorResponse createProfessor(ProfessorRequest request) {
        log.info("Professor Request: {}", request);
        Professor professor = Professor.builder()
                .firstName(request.getProfFirstName())
                .lastName(request.getProfLastName())
                .build();

        professor = professorRepository.save(professor);

        return ProfessorResponse.builder()
                .firstName(professor.getFirstName())
                .lastName(professor.getLastName())
                .build();

    }
}
