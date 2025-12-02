package rs.aradosavljevic.SERPS.worker.application.request;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkerPositionUpdateRequest {

    private LocalDate validFrom;
    private LocalDate validTo;

    @DecimalMin(value = "0.0", inclusive = false, message = "Fraction must be greater than 0")
    @DecimalMax(value = "1.0", message = "Fraction cannot exceed 1.0")
    private BigDecimal fraction;

    private Boolean isPrimary;
}
