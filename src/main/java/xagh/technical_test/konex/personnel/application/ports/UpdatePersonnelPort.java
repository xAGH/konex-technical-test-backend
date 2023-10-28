package xagh.technical_test.konex.personnel.application.ports;

import xagh.technical_test.konex.personnel.domain.entities.PersonnelModel;

public interface UpdatePersonnelPort {
    PersonnelModel invoke(PersonnelModel user);
}
