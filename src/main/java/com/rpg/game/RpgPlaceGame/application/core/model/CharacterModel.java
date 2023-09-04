package com.rpg.game.RpgPlaceGame.application.core.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CharacterModel {

    private Long id;

    private String name;

    private String life;

    private String image;

    private String doc;

    @JsonBackReference
    private DeskModel desk;

    private Long creator;
}
