package com.rpg.game.RpgPlaceGame.application.core.usecase;

import com.rpg.game.RpgPlaceGame.application.core.exception.CoreException;
import com.rpg.game.RpgPlaceGame.application.core.model.DeskModel;
import com.rpg.game.RpgPlaceGame.port.db.DeskPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class DeskUseCase {

    @Autowired
    private DeskPort deskPort;

    public DeskModel findDesk(Long id) {

        var response = deskPort.findById(id);

        if (Objects.isNull(response)) {
            throw new CoreException("Erro");
        }

        return response;
    }

    public List<DeskModel> findAll() {
        return deskPort.findAll();
    }

    public DeskModel addUser(DeskModel model) {
        validarCampos(model);

        return deskPort.save(model);
    }

    public DeskModel updateUser(Long id, DeskModel model) {
        if (Objects.isNull(id)) {
            throw new CoreException("Erro");
        }

        validarCampos(model);

        var user = findDesk(id);
        var response = Objects.equals(user.getId(), model.getId()) ? deskPort.save(model) : null;
        if (Objects.isNull(response)) {
            throw new CoreException("Erro");
        }
        return response;
    }

    private void validarCampos(DeskModel model) {
        if (Objects.isNull(model)) {
            throw new CoreException("Erro");
        }
    }
}
