package com.rpg.game.RpgPlaceGame.adapters.database.mapper;

import com.rpg.game.RpgPlaceGame.adapters.database.entity.CharacterEntity;
import com.rpg.game.RpgPlaceGame.application.core.model.CharacterModel;

import java.util.List;

public interface CharacterMapper {

    CharacterModel toModel(CharacterEntity entity);

    List<CharacterModel> toModelList(List<CharacterEntity> list);

    CharacterEntity toEntity(CharacterModel model);
}
