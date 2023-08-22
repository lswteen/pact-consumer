package com.pact.consumer.sample.service;

import com.pact.consumer.sample.port.SampleInfrastructurePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SampleService {
    private final SampleInfrastructurePort sampleInfrastructurePort;

    public SampleInfrastructurePort.Sample findById(Long id){
        return sampleInfrastructurePort.findById(id);

    }

}
