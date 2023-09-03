package com.rpg.game.RpgPlaceGame.adapters.web.impl;

import com.rpg.game.RpgPlaceGame.adapters.web.dto.CharacterDto;
import com.rpg.game.RpgPlaceGame.adapters.web.mapper.CharacterDtoMapper;
import com.rpg.game.RpgPlaceGame.application.core.model.CharacterModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CharacterDtoMapperImpl implements CharacterDtoMapper {

    @Override
    public CharacterDto toDto(CharacterModel model) {
        return CharacterDto.builder()
                .id(model.getId())
                .name(model.getName())
                .life(model.getLife())
                .image(model.getImage())
                .doc(model.getDoc())
                .creator(model.getCreator())
                .build();
    }

    @Override
    public CharacterModel toModel(CharacterDto dto) {
        return CharacterModel.builder()
                .id(dto.getId())
                .name(dto.getName())
                .life(dto.getLife())
                .image(dto.getImage())
                .doc(dto.getDoc())
                .creator(dto.getCreator())
                .build();
    }

    @Override
    public List<CharacterDto> toDtoList(List<CharacterModel> list) {
        return list.stream().map(this::toDto).toList();
    }
}
