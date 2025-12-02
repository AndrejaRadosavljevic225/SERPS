package rs.aradosavljevic.SERPS.worker.application.request;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
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
public class WorkerPositionAssignRequest {

    @NotNull(message = "Worker ID is required")
    private UUID workerId;

    @NotNull(message = "Position ID is required")
    private UUID positionId;

    @NotNull(message = "Valid from date is required")
    private LocalDate validFrom;

    private LocalDate validTo;

    @NotNull(message = "Fraction is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Fraction must be greater than 0")
    @DecimalMax(value = "1.0", message = "Fraction cannot exceed 1.0")
    private BigDecimal fraction;

    private Boolean isPrimary;
}
