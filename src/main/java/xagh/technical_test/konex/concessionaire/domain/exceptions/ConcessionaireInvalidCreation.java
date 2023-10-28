package xagh.technical_test.konex.concessionaire.domain.exceptions;

import xagh.technical_test.konex.core.domain.exceptions.InvalidEntityCreation;

public class ConcessionaireInvalidCreation extends InvalidEntityCreation {
    public ConcessionaireInvalidCreation(String reason) {
        super(reason);
    }
}
