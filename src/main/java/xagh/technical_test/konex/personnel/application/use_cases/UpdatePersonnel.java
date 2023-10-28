package xagh.technical_test.konex.personnel.application.use_cases;

import xagh.technical_test.konex.common.annotations.Transaction;
import xagh.technical_test.konex.common.annotations.UseCase;
import xagh.technical_test.konex.personnel.application.ports.UpdatePersonnelPort;
import xagh.technical_test.konex.personnel.domain.entities.PersonnelModel;
import xagh.technical_test.konex.personnel.domain.repositories.PersonnelRepository;

@UseCase
@Transaction
public class UpdatePersonnel implements UpdatePersonnelPort {

    private final PersonnelRepository personnelRepository;

    public UpdatePersonnel(PersonnelRepository personnelRepository){
        this.personnelRepository = personnelRepository;
    }

    @Override
    public PersonnelModel invoke(PersonnelModel user) {
        return personnelRepository.update(user);
    }
}
