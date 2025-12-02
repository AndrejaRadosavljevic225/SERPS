package rs.aradosavljevic.SERPS.worker.application.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PositionCreateRequest {

    @NotBlank(message = "Position title is required")
    private String title;

    @NotBlank(message = "Salary grade is required")
    private String salaryGrade;

    @NotNull(message = "Base salary is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Base salary must be greater than 0")
    private BigDecimal baseSalary;

    private Boolean isVacant;

    private String budgetLine;
}
