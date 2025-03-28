package com.rpg.game.RpgPlaceGame.adapters.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.List;

import static org.hibernate.annotations.CascadeType.ALL;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name = "desks")
public class DeskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "master", nullable = false)
    private Long master;

    @OneToMany
    @Cascade(ALL)
    @JoinColumn(name = "id")
    private List<CharacterEntity> characters;

    @Column(name = "code")
    private String code;
}
