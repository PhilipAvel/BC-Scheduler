package shop.service.subject;

import shop.model.dto.subject.SubjectRequest;
import shop.model.dto.subject.SubjectResponse;

public interface SubjectService {

    SubjectResponse createSubject(SubjectRequest request);
}
