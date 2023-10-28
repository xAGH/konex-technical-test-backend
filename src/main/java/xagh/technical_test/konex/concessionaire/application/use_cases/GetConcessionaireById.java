package xagh.technical_test.konex.concessionaire.application.use_cases;

import xagh.technical_test.konex.common.annotations.Transaction;
import xagh.technical_test.konex.common.annotations.UseCase;
import xagh.technical_test.konex.concessionaire.application.ports.GetConcessionaireByIdPort;
import xagh.technical_test.konex.concessionaire.domain.models.ConcessionaireModel;
import xagh.technical_test.konex.concessionaire.domain.reporitories.ConcessionaireRepository;

import java.util.UUID;

@UseCase
@Transaction
public class GetConcessionaireById implements GetConcessionaireByIdPort {

    private final ConcessionaireRepository concessionaireRepository;

    public GetConcessionaireById(ConcessionaireRepository concessionaireRepository) {
        this.concessionaireRepository = concessionaireRepository;
    }

    @Override
    public ConcessionaireModel invoke(UUID id) {
        return concessionaireRepository.findOne(id);
    }

}
