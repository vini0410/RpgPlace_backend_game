package com.rpg.game.RpgPlaceGame.adapters.database.service;

import com.rpg.game.RpgPlaceGame.adapters.database.mapper.CharacterMapper;
import com.rpg.game.RpgPlaceGame.adapters.database.repository.CharacterRepository;
import com.rpg.game.RpgPlaceGame.application.core.model.CharacterModel;
import com.rpg.game.RpgPlaceGame.port.db.CharacterPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CharacterService implements CharacterPort {

    @Autowired
    private CharacterRepository repository;
    @Autowired
    private CharacterMapper mapper;

    @Override
    public CharacterModel findById(Long id) {
        var response = repository.findById(id);
        return response.map(characterEntity -> mapper.toModel(characterEntity)).orElse(null);

    }

    @Override
    public List<CharacterModel> findAll() {
        return mapper.toModelList(repository.findAll());
    }

    @Override
    public CharacterModel save(CharacterModel model) {
        return mapper.toModel(repository.save(mapper.toEntity(model)));
    }
}
