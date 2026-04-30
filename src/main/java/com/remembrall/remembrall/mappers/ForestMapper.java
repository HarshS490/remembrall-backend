package com.remembrall.remembrall.mappers;

import com.remembrall.remembrall.dto.ForestDto;
import com.remembrall.remembrall.entities.Forest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ForestMapper {
    public ForestDto transformForestToForestDto(Forest forest) {
        return new ForestDto(
                forest.getName(),
                forest.getDescription()
        );
    }

    public Forest transformForestDtoToForest(ForestDto forestDto) {
        return new Forest(
                forestDto.name(),
                forestDto.description(),
                new ArrayList<>()
        );
    }
}
