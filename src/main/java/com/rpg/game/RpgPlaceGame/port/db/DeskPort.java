package com.rpg.game.RpgPlaceGame.port.db;

import com.rpg.game.RpgPlaceGame.application.core.model.DeskModel;

import java.util.List;

public interface DeskPort {

    DeskModel save(DeskModel model);

    DeskModel findById(Long id);

    List<DeskModel> findAll();

    List<DeskModel> findByIds(List<Long> ids);

    List<DeskModel> findByMaster(Long id);
}
