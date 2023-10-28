package xagh.technical_test.konex.personnel.domain.exceptions;

import xagh.technical_test.konex.core.domain.exceptions.InvalidEntityCreation;

public class PersonnelInvalidCreation extends InvalidEntityCreation {

    public PersonnelInvalidCreation(String reason) {
        super(reason);
    }

}
