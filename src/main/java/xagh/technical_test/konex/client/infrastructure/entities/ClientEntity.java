package xagh.technical_test.konex.client.infrastructure.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import xagh.technical_test.konex.concessionaire.infrastrucure.entities.ConcessionaireEntity;
import xagh.technical_test.konex.personnel.infrastructure.entities.PersonnelEntity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "client")
public class ClientEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "documnent", nullable = false)
    @NotBlank
    @Size(min = 2, max = 20)
    private String document;

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 2, max = 50)
    private String name;

    @Column(name = "address", nullable = false)
    @NotBlank
    @Size(min = 2, max = 2550)
    private String address;

    @Column(name = "phone", nullable = false)
    @NotBlank
    @Size(min = 4, max = 15)
    private String phone;

    @Column(name = "email", nullable = false, unique = true)
    @NotBlank
    @Size(min = 6, max = 255)
    private String email;

    @CreatedDate
    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "concessionaire")
    private ConcessionaireEntity concessionaire;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private PersonnelEntity createdBy;

}
