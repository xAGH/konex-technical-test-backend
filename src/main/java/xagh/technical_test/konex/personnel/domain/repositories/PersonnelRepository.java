package xagh.technical_test.konex.personnel.domain.repositories;

import xagh.technical_test.konex.core.domain.repositories.BaseRepository;
import xagh.technical_test.konex.personnel.domain.entities.PersonnelModel;

public interface PersonnelRepository extends BaseRepository<PersonnelModel> {
    PersonnelModel findByEmail(String email);
}
