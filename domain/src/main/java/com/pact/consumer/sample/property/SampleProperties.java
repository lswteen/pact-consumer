package com.pact.consumer.sample.property;

import lombok.Builder;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Builder
@Configuration
public class SampleProperties {
    private String includeMessage;
    private String includeBindingErrors;
    private String includeStacktrace;
    private String includeException;

}
