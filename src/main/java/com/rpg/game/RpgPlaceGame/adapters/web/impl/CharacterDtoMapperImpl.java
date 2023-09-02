package com.rpg.game.RpgPlaceGame.adapters.web.impl;

import com.rpg.game.RpgPlaceGame.adapters.web.dto.CharacterDto;
import com.rpg.game.RpgPlaceGame.adapters.web.mapper.CharacterDtoMapper;
import com.rpg.game.RpgPlaceGame.application.core.model.CharacterModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CharacterDtoMapperImpl implements CharacterDtoMapper {
    @Override
    public List<CharacterDto> toDtoList(List<CharacterModel> list) {
        return new ArrayList<>();
    }

    @Override
    public CharacterDto toDto(CharacterModel character) {
        return CharacterDto.builder().build();
    }

    @Override
    public CharacterModel toModel(CharacterDto dto) {
        return CharacterModel.builder().build();
    }
}
