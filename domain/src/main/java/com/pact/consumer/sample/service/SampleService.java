package com.pact.consumer.sample.service;

import com.pact.consumer.sample.port.SampleExternalPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SampleService {
    private final SampleExternalPort sampleExternalPort;
}
