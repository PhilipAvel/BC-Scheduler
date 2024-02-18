package shop.service.subject;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import shop.model.Subject;
import shop.model.dto.subject.SubjectRequest;
import shop.model.dto.subject.SubjectResponse;
import shop.repository.SubjectRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class SubjectServiceImpl implements SubjectService{

    private final SubjectRepository subjectRepository;

    @Override
    public SubjectResponse createSubject(SubjectRequest request) {

        Subject subject = Subject.builder()
                .subjectCode(request.getSubjectCode())
                .subjectName(request.getSubjectName())
                .build();

        subject = subjectRepository.save(subject);

        return SubjectResponse.builder()
                .subjectCode(subject.getSubjectCode())
                .subjectName(subject.getSubjectName())
                .build();
    }
}
