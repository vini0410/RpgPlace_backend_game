package com.rpg.game.RpgPlaceGame.adapters.web.impl;

import com.rpg.game.RpgPlaceGame.adapters.web.dto.DeskDto;
import com.rpg.game.RpgPlaceGame.adapters.web.mapper.DeskDtoMapper;
import com.rpg.game.RpgPlaceGame.application.core.model.DeskModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Component
public class DeskDtoMapplerImpl implements DeskDtoMapper {
    @Override
    public DeskDto toDto(DeskModel model) {
        return DeskDto.builder().build();
    }

    @Override
    public List<DeskDto> toDtoList(List<DeskModel> list) {
        return new ArrayList<>();
    }

    @Override
    public DeskModel toModel(DeskDto dto) {
        return DeskModel.builder().build();
    }
}
