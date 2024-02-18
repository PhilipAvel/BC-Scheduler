package shop.model.dto.schedule;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScheduleRequest {

    private Long professorId;

    private Long subjectId;

    private Long roomId;

    private String date;

    private String time;
}
