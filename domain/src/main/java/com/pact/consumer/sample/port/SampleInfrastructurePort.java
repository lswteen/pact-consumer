package com.pact.consumer.sample.port;

import lombok.*;

public interface SampleInfrastructurePort {

    SampleInfrastructure findById(Long id);

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Getter
    @ToString
    class SampleInfrastructure{
        private Long id;
        private String name;
        private String info;

    }
}
