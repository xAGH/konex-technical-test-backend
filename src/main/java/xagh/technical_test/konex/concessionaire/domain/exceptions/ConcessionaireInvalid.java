package xagh.technical_test.konex.concessionaire.domain.exceptions;

import xagh.technical_test.konex.core.domain.exceptions.InvalidEntityCreation;

public class ConcessionaireInvalid extends InvalidEntityCreation {
    public ConcessionaireInvalid(String reason) {
        super(reason);
    }
}
