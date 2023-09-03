package com.rpg.game.RpgPlaceGame.adapters.web.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonNaming(SnakeCaseStrategy.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DeskDto {

    private Long id;
    private String name;
    private Long master;
    private List<CharacterDto> characters;
    private String code;
}
