package xagh.technical_test.konex.personnel.application.use_cases;

import xagh.technical_test.konex.common.annotations.Transaction;
import xagh.technical_test.konex.common.annotations.UseCase;
import xagh.technical_test.konex.personnel.application.ports.DeletePersonnelPort;
import xagh.technical_test.konex.personnel.domain.entities.PersonnelModel;
import xagh.technical_test.konex.personnel.domain.repositories.PersonnelRepository;

import java.util.UUID;

@Transaction
@UseCase
public class DeletePersonnel implements DeletePersonnelPort {

    private final PersonnelRepository personnelRepository;

    public DeletePersonnel(PersonnelRepository personnelRepository) {
        this.personnelRepository = personnelRepository;
    }

    @Override
    public PersonnelModel invoke(UUID id) {
        return personnelRepository.delete(id);
    }
}
