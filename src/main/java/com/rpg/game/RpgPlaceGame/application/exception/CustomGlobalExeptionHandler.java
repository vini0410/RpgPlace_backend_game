package com.rpg.game.RpgPlaceGame.application.exception;

import com.rpg.game.RpgPlaceGame.adapters.exception.IntegrationException;
import com.rpg.game.RpgPlaceGame.application.core.exception.CoreException;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RequiredArgsConstructor
@ControllerAdvice
@Generated
public class CustomGlobalExeptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {IntegrationException.class})
    public ResponseEntity<Object> integrationError(IntegrationException erro) {
        return ResponseEntity.badRequest().body(erro.getMessage());
    }

    @ExceptionHandler(value = {CoreException.class})
    public ResponseEntity<Object> coreError(CoreException erro) {
        return ResponseEntity.badRequest().body(erro.getMessage());
    }
}
