package xagh.technical_test.konex.concessionaire.application.ports;

import xagh.technical_test.konex.concessionaire.domain.models.ConcessionaireModel;

import java.util.UUID;

public interface GetConcessionaireByIdPort {
    ConcessionaireModel invoke(UUID id);
}
