package com.rpg.game.RpgPlaceGame.adapters.database.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "desk_id")
    private DeskEntity desk;

    private Long creator;
}
