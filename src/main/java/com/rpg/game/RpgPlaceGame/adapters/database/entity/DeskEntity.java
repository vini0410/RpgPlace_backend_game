package com.rpg.game.RpgPlaceGame.adapters.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name = "desks")
public class DeskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "master", nullable = false)
    private Long master;

    @Column(name = "characters")
    private List<CharacterEntity> characters;

    @Column(name = "code")
    private String code;
}
