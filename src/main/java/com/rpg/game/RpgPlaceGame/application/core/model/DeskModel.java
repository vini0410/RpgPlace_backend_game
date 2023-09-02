package com.rpg.game.RpgPlaceGame.application.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DeskModel {

    private Long id;

    private String nome;

//    private UserModel mestre;

    private List<CharacterModel> personagens;

    private String codigo;
}
