package com.pact.consumer.sample.port;

import com.pact.consumer.sample.response.SampleResponse;
import org.springframework.http.ResponseEntity;

public interface SampleRestPort {
    ResponseEntity<SampleResponse> findSamples(Long id);
}
