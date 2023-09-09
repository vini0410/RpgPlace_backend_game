package com.rpg.game.RpgPlaceGame.application.core.usecase.utils;

import com.rpg.game.RpgPlaceGame.application.core.exception.CoreException;
import com.rpg.game.RpgPlaceGame.application.core.model.CharacterModel;
import com.rpg.game.RpgPlaceGame.application.core.model.DeskModel;
import lombok.experimental.UtilityClass;

import java.util.Objects;

@UtilityClass
public class RpgUtils {

    public static void validateDesk(DeskModel model) {
        if (Objects.isNull(model)) {
            throw new CoreException("Erro");
        }
    }

    public static void validateCharacter(CharacterModel model) {
        if (Objects.isNull(model)) {
            throw new CoreException("Erro");
        }
    }

}
