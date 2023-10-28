package xagh.technical_test.konex.personnel.application.use_cases;

import xagh.technical_test.konex.common.annotations.Transaction;
import xagh.technical_test.konex.common.annotations.UseCase;
import xagh.technical_test.konex.personnel.application.ports.GetPersonnelByEmailPort;
import xagh.technical_test.konex.personnel.domain.entities.PersonnelModel;
import xagh.technical_test.konex.personnel.domain.repositories.PersonnelRepository;

@UseCase
@Transaction
public class GetPersonnelByEmail implements GetPersonnelByEmailPort {

    private final PersonnelRepository personnelRepository;

    public GetPersonnelByEmail(PersonnelRepository personnelRepository) {
        this.personnelRepository = personnelRepository;
    }

    @Override
    public PersonnelModel invoke(String email) {
        return personnelRepository.findByEmail(email);
    }

}
