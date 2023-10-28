package xagh.technical_test.konex.core.infrastructure.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import xagh.technical_test.konex.core.domain.exceptions.EntityNotFound;
import xagh.technical_test.konex.core.infrastructure.ResponseBody;

@ControllerAdvice
public class EntityNotFoundController {
    @ExceptionHandler(EntityNotFound.class)
    public ResponseEntity<ResponseBody> handle(EntityNotFound exception) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(
                        ResponseBody
                                .builder()
                                .status(false)
                                .message(exception.getMessage())
                                .build()
                );
    }
}
