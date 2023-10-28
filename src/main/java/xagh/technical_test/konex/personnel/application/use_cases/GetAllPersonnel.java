package xagh.technical_test.konex.personnel.application.use_cases;

import xagh.technical_test.konex.common.annotations.Transaction;
import xagh.technical_test.konex.common.annotations.UseCase;
import xagh.technical_test.konex.personnel.application.ports.GetAllPersonnelPort;
import xagh.technical_test.konex.personnel.domain.entities.PersonnelModel;
import xagh.technical_test.konex.personnel.domain.repositories.PersonnelRepository;

import java.util.List;

@UseCase
@Transaction
public class GetAllPersonnel implements GetAllPersonnelPort {

    private final PersonnelRepository personnelRepository;

    public GetAllPersonnel(PersonnelRepository personnelRepository) {
        this.personnelRepository = personnelRepository;
    }

    @Override
    public List<PersonnelModel> invoke() {
        return personnelRepository.findAll();
    }
}
