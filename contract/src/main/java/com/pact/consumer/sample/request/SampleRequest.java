package com.pact.consumer.sample.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
public class SampleRequest {
    private Long id;
    private String name;
}
