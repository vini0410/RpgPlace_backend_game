package com.rpg.game.RpgPlaceGame.port.db;

import com.rpg.game.RpgPlaceGame.application.core.model.CharacterModel;

import java.util.List;

public interface CharacterPort {

    CharacterModel findById(Long id);

    List<CharacterModel> findAll();

    List<CharacterModel> findByPlayer(Long user);

    CharacterModel save (CharacterModel model);
}
