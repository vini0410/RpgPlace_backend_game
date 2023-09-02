package com.rpg.game.RpgPlaceGame.port.db;

import com.rpg.game.RpgPlaceGame.application.core.model.DeskModel;

import java.util.List;

public interface DeskPort {

    DeskModel findById(Long id);

    List<DeskModel> findAll();

    DeskModel save(DeskModel model);
}
