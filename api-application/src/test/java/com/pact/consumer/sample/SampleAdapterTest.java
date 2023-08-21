package com.pact.consumer.sample;

import com.pact.consumer.sample.entity.SampleEntity;
import com.pact.consumer.sample.infrastructure.SampleRepository;
import com.pact.consumer.sample.port.SampleInfrastructurePort;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class SampleAdapterTest {
    @Autowired
    private SampleRepository sampleRepository;

    @Test
    void sample_find_id(){
        SampleEntity sampleEntity = new SampleEntity(1L,"test_name","test_info");
        sampleRepository.save(sampleEntity);
        System.out.println("return Sample Object : "+sampleRepository.findById(1L).toString());
        assertEquals("test_name",sampleRepository.findById(1L).get().getName());
    }

}
