package com.pact.consumer.sample.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "server.error")
public class SampleProperties {
    private String includeMessage;
    private String includeBindingErrors;
    private String includeStacktrace;
    private String includeException;

}
