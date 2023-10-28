package xagh.technical_test.konex.client.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
public class ClientModel {
    private UUID id;
    private String document;
    private String name;
    private String address;
    private String phone;
    private String email;
    private UUID concessionaire;
    private UUID createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;


    public ClientModel() {
        this.id = UUID.randomUUID();
    }

}