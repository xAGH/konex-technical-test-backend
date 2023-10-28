package xagh.technical_test.konex.personnel.infrastructure.entities;

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
import xagh.technical_test.konex.concessionaire.infrastrucure.entities.ConcessionaireEntity;

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
@Table(name = "personnel")
public class PersonnelEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 2, max = 50)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    @NotBlank
    @Size(min = 6, max = 255)
    private String email;

    @Column(name = "password", nullable = false)
    @NotBlank
    @Size(min = 8, max = 255)
    private String password;

    @Column(name = "is_admin")
    @NotNull
    private Boolean isAdmin = false;

    @CreatedDate
    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @OneToMany(
            mappedBy = "createdBy",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ClientEntity> createdClients;

    @ManyToOne
    @JoinColumn(name = "concessionaire")
    private ConcessionaireEntity concessionaire;
}
