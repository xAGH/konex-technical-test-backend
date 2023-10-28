package xagh.technical_test.konex.concessionaire.domain.exceptions;

import xagh.technical_test.konex.core.domain.exceptions.EntityNotFound;

import java.util.UUID;

public class ConcessionaireNotFound extends EntityNotFound {
    public ConcessionaireNotFound(UUID id) {
        super("Concessionaire", id.toString());
    }
}
