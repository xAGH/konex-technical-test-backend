package xagh.technical_test.konex.personnel.application.ports;

import xagh.technical_test.konex.personnel.domain.entities.PersonnelModel;

import java.util.List;

public interface GetAllPersonnelPort {
    List<PersonnelModel> invoke();
}
