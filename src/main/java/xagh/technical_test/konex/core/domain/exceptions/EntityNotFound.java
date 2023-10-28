package xagh.technical_test.konex.core.domain.exceptions;

public class EntityNotFound extends RuntimeException {
    public EntityNotFound(String reason) {
        super(reason);
    }
}
