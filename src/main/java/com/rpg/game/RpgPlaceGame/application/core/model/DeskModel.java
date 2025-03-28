package com.rpg.game.RpgPlaceGame.application.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DeskModel {

    private Long id;

    private String name;

    private Long master;

    private List<CharacterModel> characters;

    private String code;
}
