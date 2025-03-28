package com.rpg.game.RpgPlaceGame.adapters.web.mapper;

import com.rpg.game.RpgPlaceGame.adapters.web.dto.DeskDto;
import com.rpg.game.RpgPlaceGame.application.core.model.DeskModel;

import java.util.List;

public interface DeskDtoMapper {

    DeskDto toDto (DeskModel model);

    List<DeskDto> toDtoList (List<DeskModel> list);

    DeskModel toModel(DeskDto dto);
}
