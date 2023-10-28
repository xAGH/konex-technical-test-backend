package xagh.technical_test.konex.personnel.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xagh.technical_test.konex.personnel.infrastructure.entities.PersonnelEntity;

import java.util.UUID;

public interface PersonnelRepositoryAdapter extends JpaRepository<PersonnelEntity, UUID> {
}
