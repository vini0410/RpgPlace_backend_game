package com.rpg.game.RpgPlaceGame.adapters.database.impl;

import com.rpg.game.RpgPlaceGame.adapters.database.entity.CharacterEntity;
import com.rpg.game.RpgPlaceGame.adapters.database.mapper.CharacterMapper;
import com.rpg.game.RpgPlaceGame.adapters.database.mapper.DeskMapper;
import com.rpg.game.RpgPlaceGame.application.core.model.CharacterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CharacterMapperImpl implements CharacterMapper {

    @Autowired
    private DeskMapper deskMapper;

    @Override
    public CharacterModel toModel(CharacterEntity entity) {
        return CharacterModel.builder()
                .id(entity.getId())
                .name(entity.getName())
                .life(entity.getLife())
                .image(entity.getImage())
                .doc(entity.getDoc())
                .creator(entity.getCreator())
                .desk(deskMapper.toModel(entity.getDesk()))
                .build();
    }

    @Override
    public CharacterEntity toEntity(CharacterModel model) {
        return CharacterEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .life(model.getLife())
                .image(model.getImage())
                .doc(model.getDoc())
                .creator(model.getCreator())
                .desk(deskMapper.toEntity(model.getDesk()))
                .build();
    }

    @Override
    public List<CharacterModel> toModelList(List<CharacterEntity> list) {
        return list.stream().map(this::toModel).toList();
    }
}
