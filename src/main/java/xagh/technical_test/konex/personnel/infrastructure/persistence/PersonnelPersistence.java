package xagh.technical_test.konex.personnel.infrastructure.persistence;

import xagh.technical_test.konex.common.annotations.PersistenceAdapter;
import xagh.technical_test.konex.personnel.domain.entities.PersonnelModel;
import xagh.technical_test.konex.personnel.domain.repositories.PersonnelRepository;
import xagh.technical_test.konex.personnel.infrastructure.repositories.PersonnelRepositoryAdapter;

import java.util.List;
import java.util.UUID;


@PersistenceAdapter
public class PersonnelPersistence implements PersonnelRepository {

    private final PersonnelRepositoryAdapter repository;

    public PersonnelPersistence(PersonnelRepositoryAdapter repository) {
        this.repository = repository;
    }


    @Override
    public PersonnelModel save(PersonnelModel personnelModel) {
        return null;
    }

    @Override
    public List<PersonnelModel> findAll() {
        return null;
    }

    @Override
    public PersonnelModel findOne(UUID modelId) {
        return null;
    }

    @Override
    public PersonnelModel update(PersonnelModel personnelModel) {
        return null;
    }

    @Override
    public PersonnelModel delete(UUID modelId) {
        return null;
    }

    @Override
    public PersonnelModel findByEmail(String email) {
        return null;
    }
}
