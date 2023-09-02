package com.rpg.game.RpgPlaceGame.adapters.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "characters")
public class CharacterEntity {

    @Id
    private Long id;

    @Column
    private String name;
}
