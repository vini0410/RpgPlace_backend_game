package com.rpg.game.RpgPlaceGame.adapters.database.repository;

import com.rpg.game.RpgPlaceGame.adapters.database.entity.DeskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeskRepository extends JpaRepository<DeskEntity, Long> {
}
