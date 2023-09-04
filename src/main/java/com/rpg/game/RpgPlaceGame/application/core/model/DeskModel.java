package com.rpg.game.RpgPlaceGame.application.core.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @JsonManagedReference
    private List<CharacterModel> characters;

    private String code;
}
