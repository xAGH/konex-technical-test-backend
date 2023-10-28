package xagh.technical_test.konex.core.domain.repositories;

import java.util.List;
import java.util.UUID;

public interface BaseRepository<T> {

    T save(T entity);

    List<T> findAll();

    T findOne(UUID entityId);

    T update(UUID entityId, T entity);

    T delete(UUID entityId);

}
