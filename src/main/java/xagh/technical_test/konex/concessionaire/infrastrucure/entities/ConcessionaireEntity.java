package xagh.technical_test.konex.concessionaire.infrastrucure.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import xagh.technical_test.konex.client.infrastructure.entities.ClientEntity;
import xagh.technical_test.konex.personnel.infrastructure.entities.PersonnelEntity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "concessionaire")
public class ConcessionaireEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 2, max = 50)
    private String name;

    @Column(name = "lat", nullable = false)
    @NotNull
    private Double lat;

    @Column(name = "lon", nullable = false)
    @NotNull
    private Double lon;

    @Column(name = "phone", nullable = false)
    @NotBlank
    @Size(min = 4, max = 15)
    private String phone;

    @Column(name = "available", nullable = false)
    @NotNull
    private Boolean available = true;

    @CreatedDate
    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @OneToMany(
            mappedBy = "concessionaire",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<PersonnelEntity> users;

    @OneToMany(
            mappedBy = "concessionaire",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ClientEntity> clients;
}
