package xagh.technical_test.konex.core.domain.repositories;

import java.util.List;
import java.util.UUID;

public interface BaseRepository<Model> {

    Model save(Model model);

    List<Model> findAll();

    Model findOne(UUID modelId);

    Model update(Model model);

    Model delete(UUID modelId);

}
