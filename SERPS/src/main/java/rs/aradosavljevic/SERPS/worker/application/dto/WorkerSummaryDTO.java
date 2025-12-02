package rs.aradosavljevic.SERPS.worker.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkerSummaryDTO {
    private UUID workerId;
    private String fullName;
    private String email;
    private String employmentStatus;
    private String currentPositionTitle;
    private Boolean hasActivePosition;
}
