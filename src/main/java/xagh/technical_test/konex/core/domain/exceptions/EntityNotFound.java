package xagh.technical_test.konex.core.domain.exceptions;

public class EntityNotFound extends RuntimeException {
    public EntityNotFound(String entity, String id) {
        super(String.format("%s with id %s not found.", entity, id));
    }
}
