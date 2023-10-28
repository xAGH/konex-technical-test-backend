package xagh.technical_test.konex.concessionaire.infrastrucure.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xagh.technical_test.konex.concessionaire.application.ports.GetConcessionaireByIdPort;
import xagh.technical_test.konex.concessionaire.domain.models.ConcessionaireModel;
import xagh.technical_test.konex.core.infrastructure.ResponseBody;

import java.util.UUID;

@RestController()
@RequestMapping("/api/concessionaire")
public class GetConcessionaireController {
    private final GetConcessionaireByIdPort getConcessionaireByIdPort;

    public GetConcessionaireController(GetConcessionaireByIdPort getConcessionaireByIdPort) {
        this.getConcessionaireByIdPort = getConcessionaireByIdPort;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseBody> getConcessionaireById(@PathVariable UUID id) {
        ConcessionaireModel concessionaire = getConcessionaireByIdPort.invoke(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ResponseBody
                        .builder()
                        .status(true)
                        .data(concessionaire)
                        .build()
                );
    }
}
