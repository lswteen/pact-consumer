package com.pact.consumer.sample.port;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

public interface SampleInfrastructurePort {
    SampleInfrastructurePort.Sample findById(Long id);
    List<Sample> findAll();
    Sample save(Sample request);
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
