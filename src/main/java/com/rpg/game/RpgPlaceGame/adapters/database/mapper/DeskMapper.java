package com.rpg.game.RpgPlaceGame.adapters.database.mapper;

import com.rpg.game.RpgPlaceGame.adapters.database.entity.DeskEntity;
import com.rpg.game.RpgPlaceGame.application.core.model.DeskModel;

import java.util.List;

public interface DeskMapper {

    DeskModel toModel(DeskEntity entity);

    List<DeskModel> toModelList(List<DeskEntity> list);

    DeskEntity toEntity(DeskModel model);
}
