package com.rpg.game.RpgPlaceGame.adapters.web.controller;

import com.rpg.game.RpgPlaceGame.adapters.web.dto.CharacterDto;
import com.rpg.game.RpgPlaceGame.adapters.web.mapper.CharacterDtoMapper;
import com.rpg.game.RpgPlaceGame.application.core.usecase.character.CharacterUseCase;
import com.rpg.game.RpgPlaceGame.application.core.usecase.character.CreateCharacterUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/character")
@RestController
@AllArgsConstructor
public class CharacterController {

    @Autowired
    private CharacterUseCase useCase;
    @Autowired
    private CharacterDtoMapper mapper;

    @Autowired
    private CreateCharacterUseCase createCharacter;

    @PostMapping
    public CharacterDto addCharacter(@RequestBody CharacterDto dto) {
        return mapper.toDto(useCase.addCharacter(mapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public CharacterDto updateUser(@PathVariable Long id, @RequestBody CharacterDto dto) {
        return mapper.toDto(useCase.updateCharacter(id, mapper.toModel(dto)));
    }

    @GetMapping("/{id}")
    public CharacterDto findById(@PathVariable Long id) {
        return mapper.toDto(useCase.findCharacter(id));
    }

    @GetMapping("/all")
    public List<CharacterDto> findAll() {
        return mapper.toDtoList(useCase.findAll());
    }


    @PostMapping("/add-character")
    public CharacterDto createCharacter(@RequestBody CharacterDto dto) {
        return mapper.toDto(createCharacter.createCharacter(mapper.toModel(dto)));
    }

}
