package rs.aradosavljevic.SERPS.worker.application.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkerUpdateRequest {

    private String firstName;
    private String lastName;

    @Email(message = "Email must be valid")
    private String email;

    @Pattern(regexp = "^\\+?[0-9\\s-]{9,15}$", message = "Phone number must be valid")
    private String phone;

    private LocalDate terminationDate;
    private String employmentStatus;
    private String employmentType;
}
