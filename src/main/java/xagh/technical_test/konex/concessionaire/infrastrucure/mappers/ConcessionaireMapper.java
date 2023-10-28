package xagh.technical_test.konex.concessionaire.infrastrucure.mappers;

import xagh.technical_test.konex.concessionaire.domain.models.ConcessionaireModel;
import xagh.technical_test.konex.concessionaire.infrastrucure.entities.ConcessionaireEntity;

import java.util.ArrayList;
import java.util.List;

public class ConcessionaireMapper {

    public static ConcessionaireModel entityToModel(ConcessionaireEntity entity) {
        return ConcessionaireModel
                .builder()
                .id(entity.getId())
                .name(entity.getName())
                .lat(entity.getLat())
                .lon(entity.getLon())
                .phone(entity.getPhone())
                .available(entity.getAvailable())
//                .clients(entity.getClients())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .deletedAt(entity.getDeletedAt())
                .build();
    }

    public static ConcessionaireEntity modelToEntity(ConcessionaireModel model) {
        return ConcessionaireEntity
                .builder()
                .id(model.getId())
                .name(model.getName())
                .lat(model.getLat())
                .lon(model.getLon())
                .phone(model.getPhone())
                .available(model.getAvailable())
//                .clients(model.getClients())
                .createdAt(model.getCreatedAt())
                .updatedAt(model.getUpdatedAt())
                .deletedAt(model.getDeletedAt())
                .build();
    }

    public static List<ConcessionaireEntity> modelToEntity(List<ConcessionaireModel> models) {
        ArrayList<ConcessionaireEntity> entities = new ArrayList<>(models.size());
        for (ConcessionaireModel model : models) {
            entities.add(modelToEntity(model));
        }
        return entities;
    }

    public static List<ConcessionaireModel> entityToModel(List<ConcessionaireEntity> entities) {
        ArrayList<ConcessionaireModel> models = new ArrayList<>(entities.size());
        for (ConcessionaireEntity entity : entities) {
            models.add(entityToModel(entity));
        }
        return models;
    }
}
