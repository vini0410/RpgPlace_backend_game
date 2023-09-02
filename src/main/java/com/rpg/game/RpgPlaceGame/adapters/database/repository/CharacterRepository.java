package com.rpg.game.RpgPlaceGame.adapters.database.repository;

import com.rpg.game.RpgPlaceGame.adapters.database.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {
}
