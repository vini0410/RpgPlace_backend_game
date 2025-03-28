package com.rpg.game.RpgPlaceGame.application.core.usecase.character;

import com.rpg.game.RpgPlaceGame.application.core.exception.CoreException;
import com.rpg.game.RpgPlaceGame.application.core.model.CharacterModel;
import com.rpg.game.RpgPlaceGame.port.db.CharacterPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static com.rpg.game.RpgPlaceGame.application.core.usecase.utils.RpgUtils.validateCharacter;

@Service
@RequiredArgsConstructor
public class CharacterUseCase {

    @Autowired
    private CharacterPort characterPort;

    public CharacterModel addCharacter(CharacterModel model) {
        validateCharacter(model);

        return characterPort.save(model);
    }

    public CharacterModel updateCharacter(Long id, CharacterModel model) {
        if (Objects.isNull(id)) {
            throw new CoreException("Erro");
        }

        validateCharacter(model);

        var character = findCharacter(id);
        var response = Objects.equals(character.getId(), model.getId()) ? characterPort.save(model) : null;

        if (Objects.isNull(response)) {
            throw new CoreException("Erro");
        }
        return response;
    }

    public CharacterModel findCharacter(Long id) {
        var response = characterPort.findById(id);

        if (Objects.isNull(response)) {
            throw new CoreException("Erro");
        }

        return response;
    }

    public List<CharacterModel> findAll() {
        return characterPort.findAll();
    }

}
