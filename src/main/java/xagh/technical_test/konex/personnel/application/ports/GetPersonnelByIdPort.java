package xagh.technical_test.konex.personnel.application.ports;

import xagh.technical_test.konex.personnel.domain.entities.PersonnelModel;

import java.util.UUID;

public interface GetPersonnelByIdPort {

    PersonnelModel invoke(UUID id);

}
