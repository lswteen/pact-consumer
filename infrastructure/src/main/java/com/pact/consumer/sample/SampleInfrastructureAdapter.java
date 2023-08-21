package com.pact.consumer.sample;

import com.pact.consumer.sample.infrastructure.SampleRepository;
import com.pact.consumer.sample.mapper.SampleAdapterMapper;
import com.pact.consumer.sample.port.SampleInfrastructurePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Slf4j
@Component
public class SampleInfrastructureAdapter implements SampleInfrastructurePort {

    private final SampleRepository sampleRepository;
    private final SampleAdapterMapper sampleAdapterMapper;

    @Override
    public Sample findById(Long id) {
        return sampleAdapterMapper.INSTANCE.toEntitySample(sampleRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("No Element") {}));
    }
}
