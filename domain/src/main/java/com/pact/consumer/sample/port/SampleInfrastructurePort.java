package com.pact.consumer.sample.port;

import lombok.*;

public interface SampleInfrastructurePort {
    Sample findById(Long id);

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
