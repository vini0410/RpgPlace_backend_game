package com.rpg.game.RpgPlaceGame.adapters.database.adap;

import com.rpg.game.RpgPlaceGame.adapters.database.entity.CharacterEntity;
import com.rpg.game.RpgPlaceGame.adapters.database.mapper.CharacterMapper;
import com.rpg.game.RpgPlaceGame.application.core.model.CharacterModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CharacterAdapter implements CharacterMapper {

    @Override
    public CharacterModel toModel(CharacterEntity entity) {
        return CharacterModel.builder().build();
    }

    @Override
    public List<CharacterModel> toModelList(List<CharacterEntity> list) {
        return new ArrayList<>();
    }

    @Override
    public CharacterEntity toEntity(CharacterModel model) {
        return CharacterEntity.builder().build();
    }
}
