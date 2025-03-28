package com.rpg.game.RpgPlaceGame.adapters.database.impl;

import com.rpg.game.RpgPlaceGame.adapters.database.entity.DeskEntity;
import com.rpg.game.RpgPlaceGame.adapters.database.mapper.CharacterMapper;
import com.rpg.game.RpgPlaceGame.adapters.database.mapper.DeskMapper;
import com.rpg.game.RpgPlaceGame.application.core.model.DeskModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeskMapperImpl implements DeskMapper {

    @Autowired
    private CharacterMapper characterMapper;

    @Override
    public DeskModel toModel(DeskEntity entity) {
        return DeskModel.builder()
                .id(entity.getId())
                .name(entity.getName())
                .master(entity.getMaster())
                .characters(entity.getCharacters().isEmpty() ? null :
                        entity.getCharacters().stream().map(character ->
                                characterMapper.toModel(character)).toList())
                .code(entity.getCode())
                .build();
    }

    @Override
    public DeskEntity toEntity(DeskModel model) {
        return DeskEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .master(model.getMaster())
                .characters(model.getCharacters().isEmpty() ? null :
                        model.getCharacters().stream().map(character ->
                                characterMapper.toEntity(character)).toList())
                .code(model.getCode())
                .build();
    }

    @Override
    public List<DeskModel> toModelList(List<DeskEntity> list) {
        return list.stream().map(this::toModel).toList();
    }
}
