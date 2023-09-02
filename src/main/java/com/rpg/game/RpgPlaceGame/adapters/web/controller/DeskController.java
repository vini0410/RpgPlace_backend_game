package com.rpg.game.RpgPlaceGame.adapters.web.controller;

import com.rpg.game.RpgPlaceGame.adapters.web.dto.DeskDto;
import com.rpg.game.RpgPlaceGame.adapters.web.mapper.DeskDtoMapper;
import com.rpg.game.RpgPlaceGame.application.core.usecase.DeskUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/desk")
@RestController
@AllArgsConstructor
public class DeskController {

    @Autowired
    private DeskUseCase useCase;
    @Autowired
    private DeskDtoMapper mapper;

    @GetMapping("/{id}")
    public DeskDto findDeskById(@PathVariable Long id) {
        return mapper.toDto(useCase.findDesk(id));
    }

    @GetMapping("/all")
    public List<DeskDto> findAll() {
        return mapper.toDtoList(useCase.findAll());
    }

    @PostMapping
    public DeskDto addUser(@RequestBody DeskDto dto) {
        return mapper.toDto(useCase.addUser(mapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public DeskDto updateUser(@PathVariable Long id, @RequestBody DeskDto dto) {
        return mapper.toDto(useCase.updateUser(id, mapper.toModel(dto)));
    }
}
