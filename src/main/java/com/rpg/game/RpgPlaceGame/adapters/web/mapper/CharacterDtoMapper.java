package com.rpg.game.RpgPlaceGame.adapters.web.mapper;

import com.rpg.game.RpgPlaceGame.adapters.web.dto.CharacterDto;
import com.rpg.game.RpgPlaceGame.application.core.model.CharacterModel;

import java.util.List;

public interface CharacterDtoMapper {
    List<CharacterDto> toDtoList(List<CharacterModel> all);

    CharacterDto toDto(CharacterModel character);

    CharacterModel toModel(CharacterDto dto);
}
