package com.rpg.game.RpgPlaceGame.application.core.usecase.desk;

import com.rpg.game.RpgPlaceGame.application.core.model.DeskModel;
import com.rpg.game.RpgPlaceGame.port.db.CharacterPort;
import com.rpg.game.RpgPlaceGame.port.db.DeskPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeskByUsersUseCase {

    @Autowired
    private DeskPort deskPort;

    @Autowired
    private CharacterPort characterPort;

    public List<DeskModel> findDeskByPlayer(Long user) {

        var listCharacters = characterPort.findByPlayer(user);

        var list = listCharacters.stream().map(character ->
                character.getDesk()).toList();

        var desks = deskPort.findByIds(list);

        return desks;
    }

    public List<DeskModel> findDeskByMaster(Long master) {

        var desks = deskPort.findByMaster(master);

        return desks;
    }
}
