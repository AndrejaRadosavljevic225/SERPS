package rs.aradosavljevic.SERPS.worker.application.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkerSearchRequest {
    private String searchTerm; // Search in name, email, personal ID
    private String employmentStatus;
    private String employmentType;
    private LocalDate hireDateFrom;
    private LocalDate hireDateTo;
    private Boolean hasActivePosition;
    private Integer page;
    private Integer size;
    private String sortBy;
    private String sortDirection;
}
