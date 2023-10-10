package com.rpg.game.RpgPlaceGame.application.core.usecase.character;

import com.rpg.game.RpgPlaceGame.application.core.model.CharacterModel;
import com.rpg.game.RpgPlaceGame.application.core.usecase.desk.DeskUseCase;
import com.rpg.game.RpgPlaceGame.port.db.CharacterPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.rpg.game.RpgPlaceGame.application.core.usecase.utils.RpgUtils.validateCharacter;

@Service
@RequiredArgsConstructor
public class CreateCharacterUseCase {

    @Autowired
    private CharacterPort characterPort;

    @Autowired
    private DeskUseCase deskUseCase;

    public CharacterModel createCharacter(CharacterModel model) {

        validateCharacter(model);

        var character = characterPort.save(model);

        var desk = deskUseCase.findDesk(character.getDesk());

        desk.getCharacters().add(character);

        deskUseCase.updateDesk(desk);

        return character;
    }
}
