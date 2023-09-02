package com.rpg.game.RpgPlaceGame.application.core.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMsg {

    private String code;
    private String msg;
    private HttpStatus http;
}
