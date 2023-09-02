package com.rpg.game.RpgPlaceGame.adapters.database.adap;

import com.rpg.game.RpgPlaceGame.adapters.database.entity.DeskEntity;
import com.rpg.game.RpgPlaceGame.adapters.database.mapper.DeskMapper;
import com.rpg.game.RpgPlaceGame.application.core.model.DeskModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DeskAdapter implements DeskMapper {


    @Override
    public DeskModel toModel(DeskEntity entity) {
        return DeskModel.builder().build();
    }

    @Override
    public List<DeskModel> toModelList(List<DeskEntity> list) {
        return new ArrayList<>();
    }

    @Override
    public DeskEntity toEntity(DeskModel model) {
        return DeskEntity.builder().build();
    }
}
