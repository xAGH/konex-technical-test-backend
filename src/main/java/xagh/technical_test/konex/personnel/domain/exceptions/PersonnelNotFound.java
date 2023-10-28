package xagh.technical_test.konex.personnel.domain.exceptions;

import xagh.technical_test.konex.core.domain.exceptions.EntityNotFound;

import java.util.UUID;

public class PersonnelNotFound extends EntityNotFound {
    public PersonnelNotFound(UUID id) {
        super("User", id.toString());
    }
}
