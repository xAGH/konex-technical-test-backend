package xagh.technical_test.konex.concessionaire.infrastrucure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xagh.technical_test.konex.concessionaire.infrastrucure.entities.ConcessionaireEntity;

import java.util.UUID;

public interface ConcessionaireRepositoryAdapter extends JpaRepository<ConcessionaireEntity, UUID> {
}
