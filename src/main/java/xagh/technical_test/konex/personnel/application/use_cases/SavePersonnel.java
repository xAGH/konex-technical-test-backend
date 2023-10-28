package xagh.technical_test.konex.personnel.application.use_cases;

import xagh.technical_test.konex.common.annotations.Transaction;
import xagh.technical_test.konex.common.annotations.UseCase;
import xagh.technical_test.konex.personnel.application.ports.SavePersonnelPort;
import xagh.technical_test.konex.personnel.domain.entities.PersonnelModel;
import xagh.technical_test.konex.personnel.domain.repositories.PersonnelRepository;

@UseCase
@Transaction
public class SavePersonnel implements SavePersonnelPort {

    private final PersonnelRepository personnelRepository;

    public SavePersonnel(PersonnelRepository personnelRepository) {
        this.personnelRepository = personnelRepository;
    }

    @Override
    public PersonnelModel invoke(PersonnelModel user) {
        return personnelRepository.save(user);
    }
}
