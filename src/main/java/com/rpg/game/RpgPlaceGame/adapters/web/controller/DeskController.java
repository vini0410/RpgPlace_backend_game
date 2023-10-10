package com.rpg.game.RpgPlaceGame.adapters.web.controller;

import com.rpg.game.RpgPlaceGame.adapters.web.dto.DeskDto;
import com.rpg.game.RpgPlaceGame.adapters.web.mapper.DeskDtoMapper;
import com.rpg.game.RpgPlaceGame.application.core.usecase.desk.DeskByUsersUseCase;
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

    @Autowired
    private DeskByUsersUseCase deskByUsersUseCase;

    @PostMapping
    public DeskDto addDesk(@RequestBody DeskDto dto) {
        return mapper.toDto(useCase.addDesk(mapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public DeskDto updateDesk(@PathVariable Long id, @RequestBody DeskDto dto) {
        return mapper.toDto(useCase.updateDesk(id, mapper.toModel(dto)));
    }

    @GetMapping("/{id}")
    public DeskDto findDeskById(@PathVariable Long id) {
        return mapper.toDto(useCase.findDesk(id));
    }

    @GetMapping("/all")
    public List<DeskDto> findAll() {
        return mapper.toDtoList(useCase.findAll());
    }

    @GetMapping("/by-player")
    public List<DeskDto> findByPlayer(@PathParam(value = "user") Long user) {
        return mapper.toDtoList(deskByUsersUseCase.findDeskByPlayer(user));
    }

    @GetMapping("/by-master")
    public List<DeskDto> findByMaster(@PathParam(value = "master") Long master) {
        return mapper.toDtoList(deskByUsersUseCase.findDeskByMaster(master));
    }

    @PostMapping("/create-desk")
    public DeskDto createEmptyDesk(@RequestBody DeskDto dto) {
        return mapper.toDto(useCase.createEmptyDesk(mapper.toModel(dto)));
    }
}
