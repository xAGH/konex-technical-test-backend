package xagh.technical_test.konex.personnel.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
public class PersonnelModel {
    private UUID id;
    private String name;
    private String email;
    private String password;
    private Boolean isAdmin;
    private UUID concessionaire;
    private ArrayList<UUID> createdClients;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    public PersonnelModel() {
        this.id = UUID.randomUUID();
    }
}
