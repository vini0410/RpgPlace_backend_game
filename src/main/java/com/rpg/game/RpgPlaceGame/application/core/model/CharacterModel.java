package com.rpg.game.RpgPlaceGame.application.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CharacterModel {

    private Long id;

    private String nome;

    private String vida;

    private String imagem;

    private String ficha;

//    private UserModel criador;
}
