package com.pact.consumer.sample.port;

import lombok.*;

public interface SampleExternalPort {
    SampleExternal findByid(Long id);

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder
    @ToString
    @EqualsAndHashCode
    class SampleExternal{
        private Long id;
        private String name;
        private String info;
    }

}
