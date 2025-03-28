package com.rpg.game.RpgPlaceGame.application.core.usecase.desk;

import com.rpg.game.RpgPlaceGame.application.core.exception.CoreException;
import com.rpg.game.RpgPlaceGame.application.core.model.DeskModel;
import com.rpg.game.RpgPlaceGame.port.db.DeskPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static com.rpg.game.RpgPlaceGame.application.core.usecase.utils.RpgUtils.validateDesk;

@Service
@RequiredArgsConstructor
public class DeskUseCase {

    @Autowired
    private DeskPort deskPort;

    public DeskModel addDesk(DeskModel model) {
        validateDesk(model);

        return deskPort.save(model);
    }

    public DeskModel updateDesk(Long id, DeskModel model) {
        if (Objects.isNull(id)) {
            throw new CoreException("Erro");
        }

        validateDesk(model);

        var user = findDesk(id);
        var response = Objects.equals(user.getId(), model.getId()) ? deskPort.save(model) : null;
        if (Objects.isNull(response)) {
            throw new CoreException("Erro");
        }
        return response;
    }

    public DeskModel updateDesk(DeskModel model) {
        validateDesk(model);

        var response = deskPort.save(model);
        if (Objects.isNull(response)) {
            throw new CoreException("Erro");
        }
        return response;
    }

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

    public DeskModel createEmptyDesk(DeskModel model) {
        validateDesk(model);
        return deskPort.save(model);
    }


}
