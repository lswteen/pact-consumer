package com.pact.consumer.sample.mapper;

import com.pact.consumer.config.MapstructConfig;
import com.pact.consumer.sample.entity.SampleEntity;
import com.pact.consumer.sample.port.SampleInfrastructurePort;
import com.pact.consumer.sample.result.SampleResult;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = MapstructConfig.class)
public interface SampleAdapterMapper {
    SampleAdapterMapper INSTANCE = Mappers.getMapper(SampleAdapterMapper.class);

    SampleEntity toSampleEntity(SampleInfrastructurePort.Sample source);
    SampleInfrastructurePort.Sample toResultSample(SampleResult source);

    List<SampleInfrastructurePort.Sample> toSampleList(List<SampleEntity> sampleEntityList);
    SampleInfrastructurePort.Sample toEntitySample(SampleEntity source);

}
