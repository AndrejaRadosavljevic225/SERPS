package rs.aradosavljevic.SERPS.worker.application.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
public class WorkerCreateRequest {

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Personal ID is required")
    @Pattern(regexp = "\\d{13}", message = "Personal ID must be 13 digits")
    private String personalId;

    @Pattern(regexp = "^\\+?[0-9\\s-]{9,15}$", message = "Phone number must be valid")
    private String phone;

    @NotNull(message = "Hire date is required")
    private LocalDate hireDate;

    @NotBlank(message = "Employment status is required")
    private String employmentStatus;

    @NotBlank(message = "Employment type is required")
    private String employmentType;
}
