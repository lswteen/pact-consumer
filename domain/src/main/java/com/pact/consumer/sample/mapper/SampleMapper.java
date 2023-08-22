package com.pact.consumer.sample.mapper;

import com.pact.consumer.config.MapstructConfig;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = MapstructConfig.class)
public class SampleMapper {
    SampleMapper INSTANCE = Mappers.getMapper(SampleMapper.class);

}
