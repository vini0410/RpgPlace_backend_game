package com.rpg.game.RpgPlaceGame.adapters.database.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

    @JsonManagedReference
    @OneToMany
    @Column(name = "characters_id")
    private List<CharacterEntity> characters;

    @Column(name = "code")
    private String code;
}
