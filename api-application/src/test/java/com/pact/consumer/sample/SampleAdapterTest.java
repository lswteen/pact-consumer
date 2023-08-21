package com.pact.consumer.sample;

import com.pact.consumer.sample.entity.SampleEntity;
import com.pact.consumer.sample.infrastructure.SampleRepository;
import com.pact.consumer.sample.port.SampleInfrastructurePort;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.repository.config.BootstrapMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class SampleAdapterTest {
    @Autowired
    private SampleRepository sampleRepository;

//    SampleAdapterTest(@Autowired SampleRepository sampleRepository) {
//        this.sampleRepository = sampleRepository;
//    }

    @Test
    void sample_find_id(){
        SampleEntity sampleEntity = new SampleEntity("test_name","test_info");
        sampleRepository.save(sampleEntity);

        assertEquals(SampleInfrastructurePort.Sample.builder()
                        .id(1L)
                        .name("test_name")
                        .info("test_info")
                        .build()
                ,sampleRepository.findById(1L));
    }

}
