package xagh.technical_test.konex.core.domain.exceptions;

public class InvalidEntityCreation extends RuntimeException {
    public InvalidEntityCreation(String reason) {
        super(reason);
    }
}
