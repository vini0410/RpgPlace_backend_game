package com.rpg.game.RpgPlaceGame.adapters.database.service;

import com.rpg.game.RpgPlaceGame.adapters.database.mapper.DeskMapper;
import com.rpg.game.RpgPlaceGame.adapters.database.repository.DeskRepository;
import com.rpg.game.RpgPlaceGame.application.core.model.DeskModel;
import com.rpg.game.RpgPlaceGame.port.db.DeskPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeskService implements DeskPort {

    @Autowired
    private DeskRepository repository;
    @Autowired
    private DeskMapper mapper;

    @Override
    public DeskModel save(DeskModel model) {
        return mapper.toModel(repository.save(mapper.toEntity(model)));
    }

    @Override
    public DeskModel findById(Long id) {
        var response = repository.findById(id);

        return response.map(deskEntity -> mapper.toModel(deskEntity)).orElse(null);

    }

    @Override
    public List<DeskModel> findAll() {
        var response = repository.findAll();

        return mapper.toModelList(response);
    }

    @Override
    public List<DeskModel> findByIds(List<Long> ids) {
        return mapper.toModelList(repository.findByIds(ids));
    }

    @Override
    public List<DeskModel> findByMaster(Long id) {
        return mapper.toModelList(repository.findByMaster(id));
    }


}
