package com.rpg.game.RpgPlaceGame.adapters.database.repository;

import com.rpg.game.RpgPlaceGame.adapters.database.entity.DeskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeskRepository extends JpaRepository<DeskEntity, Long> {

    @Query(value = "SELECT d " +
            "FROM DeskEntity d " +
            "WHERE d.id IN :ids")
    List<DeskEntity> findByIds(
            @Param("ids") List<Long> ids);
}
