package com.pact.consumer.sample.port;

import com.pact.consumer.sample.request.SampleRequest;
import lombok.*;

import java.util.List;

public interface SampleInfrastructurePort {
    SampleInfrastructurePort.Sample findById(Long id);
    List<Sample> findAll();
    void save(Sample request);
    void remove(Sample request);

    @NoArgsConstructor
    @Builder
    @Getter
    @ToString
    class Sample{
        private Long id;
        private String name;
        private String info;

        public Sample(Long id, String name, String info) {
            this.id = id;
            this.name = name;
            this.info = info;
        }
    }
}
