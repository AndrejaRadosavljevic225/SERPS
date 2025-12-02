package rs.aradosavljevic.SERPS.worker.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkerDetailDTO {
    private UUID workerId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String personalId;
    private String phone;
    private LocalDate hireDate;
    private LocalDate terminationDate;
    private String employmentStatus;
    private String employmentStatusName;
    private String employmentType;
    private String employmentTypeName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<WorkerPositionDTO> positions;
    private PositionDTO primaryPosition;
}
