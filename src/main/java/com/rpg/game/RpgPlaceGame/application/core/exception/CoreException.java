package com.rpg.game.RpgPlaceGame.application.core.exception;

import lombok.Data;

@Data
public class CoreException extends RuntimeException {

    public CoreException(String msg) {
        super(msg);
    }
}
