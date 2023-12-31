package xagh.technical_test.konex.concessionaire.infrastrucure.persistence;

import xagh.technical_test.konex.common.annotations.PersistenceAdapter;
import xagh.technical_test.konex.concessionaire.domain.exceptions.ConcessionaireNotFound;
import xagh.technical_test.konex.concessionaire.domain.models.ConcessionaireModel;
import xagh.technical_test.konex.concessionaire.domain.reporitories.ConcessionaireRepository;
import xagh.technical_test.konex.concessionaire.infrastrucure.mappers.ConcessionaireMapper;
import xagh.technical_test.konex.concessionaire.infrastrucure.repositories.ConcessionaireRepositoryAdapter;

import java.util.List;
import java.util.UUID;

@PersistenceAdapter
public class ConcessionairePersistence implements ConcessionaireRepository {

    private final ConcessionaireRepositoryAdapter repository;

    public ConcessionairePersistence(ConcessionaireRepositoryAdapter repository) {
        this.repository = repository;
    }

    @Override
    public ConcessionaireModel save(ConcessionaireModel entity) {
        return null;
    }

    @Override
    public List<ConcessionaireModel> findAll() {
        return ConcessionaireMapper.entityToModel(repository.findAll());
    }

    @Override
    public ConcessionaireModel findOne(UUID modelId) {
        return ConcessionaireMapper.entityToModel(
                repository
                        .findById(modelId)
                        .orElseThrow(() -> new ConcessionaireNotFound(modelId))
        );
    }

    @Override
    public ConcessionaireModel update(ConcessionaireModel model) {
        return null;
    }

    @Override
    public ConcessionaireModel delete(UUID modelId) {
        return null;
    }
}
