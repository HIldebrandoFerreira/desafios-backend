package br.com.hildebrando.api.domain.exceptions;

import br.com.hildebrando.api.services.exceptions.ObjectNotFoundExcepetion;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ModelExceptionHandler {

    @ExceptionHandler(ObjectNotFoundExcepetion.class)
    public ResponseEntity<StandardError>objectNotFound(ObjectNotFoundExcepetion ex, HttpServletRequest request) {
        StandardError error = new StandardError(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                "Object not found",
                ex.getMessage(),
                request.getRequestURI()
);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}