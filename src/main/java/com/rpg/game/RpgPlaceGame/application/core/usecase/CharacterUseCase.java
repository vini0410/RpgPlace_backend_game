package com.rpg.game.RpgPlaceGame.application.core.usecase;

import com.rpg.game.RpgPlaceGame.application.core.exception.CoreException;
import com.rpg.game.RpgPlaceGame.application.core.model.CharacterModel;
import com.rpg.game.RpgPlaceGame.port.db.CharacterPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CharacterUseCase {

    @Autowired
    private CharacterPort characterPort;

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

    public CharacterModel addCharacter(CharacterModel model) {
        validarCampos(model);

        return characterPort.save(model);
    }

    public CharacterModel updateCharacter(Long id, CharacterModel model) {
        if (Objects.isNull(id)) {
            throw new CoreException("Erro");
        }

        validarCampos(model);

        var character = findCharacter(id);
        var response = Objects.equals(character.getId(), model.getId()) ? characterPort.save(model) : null;

        if (Objects.isNull(response)) {
            throw new CoreException("Erro");
        }
        return response;
    }

    private void validarCampos(CharacterModel model) {
        if (Objects.isNull(model)) {
            throw new CoreException("Erro");
        }
    }
}
