package rs.aradosavljevic.SERPS.worker.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkerPositionDTO {
    private UUID assignmentId;
    private UUID workerId;
    private String workerName;
    private UUID positionId;
    private String positionTitle;
    private LocalDate validFrom;
    private LocalDate validTo;
    private BigDecimal fraction;
    private Boolean isPrimary;
    private Boolean isActive;
}
