package com.rpg.game.RpgPlaceGame.adapters.web.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonNaming(SnakeCaseStrategy.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CharacterDto {

    private Long id;

    private String name;

    private String life;

    private String image;

    private String doc;
    @JsonBackReference
    private DeskDto desk;

    private Long creator;
}
