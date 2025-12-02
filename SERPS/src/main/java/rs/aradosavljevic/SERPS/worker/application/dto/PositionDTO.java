package rs.aradosavljevic.SERPS.worker.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PositionDTO {
    private UUID positionId;
    private String title;
    private String salaryGrade;
    private BigDecimal baseSalary;
    private Boolean isVacant;
    private String budgetLine;
    private LocalDateTime createdAt;
}
