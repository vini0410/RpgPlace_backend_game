package com.rpg.game.RpgPlaceGame.adapters.web.impl;

import com.rpg.game.RpgPlaceGame.adapters.web.dto.DeskDto;
import com.rpg.game.RpgPlaceGame.adapters.web.mapper.CharacterDtoMapper;
import com.rpg.game.RpgPlaceGame.adapters.web.mapper.DeskDtoMapper;
import com.rpg.game.RpgPlaceGame.application.core.model.DeskModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class DeskDtoMapperImpl implements DeskDtoMapper {

    CharacterDtoMapper characterMapper;

    @Override
    public DeskDto toDto(DeskModel model) {
        return DeskDto.builder()
                .id(model.getId())
                .name(model.getName())
                .master(model.getMaster())
                .characters(model.getCharacters().isEmpty() ? null :
                        model.getCharacters().stream().map(character ->
                                characterMapper.toDto(character)).toList())
                .code(model.getCode())
                .build();
    }

    @Override
    public DeskModel toModel(DeskDto dto) {
        return DeskModel.builder()
                .id(dto.getId())
                .name(dto.getName())
                .master(dto.getMaster())
                .characters(dto.getCharacters().isEmpty() ? null :
                        dto.getCharacters().stream().map(character ->
                                characterMapper.toModel(character)).toList())
                .code(dto.getCode())
                .build();
    }

    @Override
    public List<DeskDto> toDtoList(List<DeskModel> list) {
        return list.stream().map(this::toDto).toList();
    }
}
