package com.rpg.game.RpgPlaceGame.adapters.exception;

import lombok.Getter;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@ResponseStatus
public class IntegrationException extends RuntimeException {

    public IntegrationException(String msg) {
        super(msg);
    }
}
