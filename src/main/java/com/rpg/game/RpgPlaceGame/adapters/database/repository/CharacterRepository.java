package com.rpg.game.RpgPlaceGame.adapters.database.repository;

import com.rpg.game.RpgPlaceGame.adapters.database.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {

    @Query(value = "SELECT c " +
            "FROM CharacterEntity c " +
            "WHERE c.creator = :user")
    List<CharacterEntity> findByPlayer(
            @Param("user") Long user
    );
}
