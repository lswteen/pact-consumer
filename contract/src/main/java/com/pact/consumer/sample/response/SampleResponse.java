package com.pact.consumer.sample.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
public class SampleResponse {
    private Long id;
    private String name;
}
