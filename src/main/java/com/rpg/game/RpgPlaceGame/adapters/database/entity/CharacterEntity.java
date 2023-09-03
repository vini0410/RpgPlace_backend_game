package com.rpg.game.RpgPlaceGame.adapters.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name = "characters")
public class CharacterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "life")
    private String life;

    @Column(name = "image")
    private String image;

    @Column(name = "doc")
    private String doc;

    private Long creator;
}
