package xagh.technical_test.konex.concessionaire.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
public class ConcessionaireModel {
    private UUID id;
    private String name;
    private Double lat;
    private Double lon;
    private String phone;
    private Boolean available;
    private ArrayList<UUID> clients;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;


    public ConcessionaireModel() {
        this.id = UUID.randomUUID();
    }

    public void addClient(UUID client) {
        if (this.clients == null) {
            this.clients = new ArrayList<>();
        }
        this.clients.add(client);
    }

    public void addClient(ArrayList<UUID> client) {
        if (this.clients == null) {
            this.clients = new ArrayList<>();
        }
        this.clients.addAll(client);
    }
}
