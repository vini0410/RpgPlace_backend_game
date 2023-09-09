package com.rpg.game.RpgPlaceGame.adapters.web.controller;

import com.rpg.game.RpgPlaceGame.adapters.web.dto.DeskDto;
import com.rpg.game.RpgPlaceGame.adapters.web.mapper.DeskDtoMapper;
import com.rpg.game.RpgPlaceGame.application.core.usecase.desk.DeskByPlayer;
import com.rpg.game.RpgPlaceGame.application.core.usecase.desk.DeskUseCase;
import jakarta.websocket.server.PathParam;
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
    public DeskDto addDesk(@RequestBody DeskDto dto) {
        return mapper.toDto(useCase.addDesk(mapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public DeskDto updateDesk(@PathVariable Long id, @RequestBody DeskDto dto) {
        return mapper.toDto(useCase.updateDesk(id, mapper.toModel(dto)));
    }
}
