package com.pact.consumer.sample;

import com.pact.consumer.sample.entity.SampleEntity;
import com.pact.consumer.sample.infrastructure.SampleRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class SampleAdapterTest {

    @Autowired
    private SampleRepository sampleRepository;

    @BeforeEach
    void setUp(){
        SampleEntity sampleEntity = new SampleEntity("test_name_1","test_info_1");
        sampleRepository.save(sampleEntity);
    }

    @Test
    void sample_find_id(){
        Long id = sampleRepository.findAll().stream().findFirst().get().getId();
        assertNotNull(sampleRepository.findById(id).get().getName());
    }

    @Test
    void sample_save(){
        SampleEntity sampleEntity = new SampleEntity("test_name_2","test_info_2");
        assertEquals("test_name_2",sampleRepository.save(sampleEntity).getName());
    }

    @Test
    void sample_remove_list_count(){
        SampleEntity sampleEntity_2 = new SampleEntity("test_name_2","test_info_2");
        sampleRepository.save(sampleEntity_2);
        SampleEntity sampleEntity_3 = new SampleEntity("test_name_3","test_info_3");
        sampleRepository.save(sampleEntity_3);
        sampleRepository.delete(sampleEntity_2);

        assertEquals(2,sampleRepository.findAll().stream().count());
    }



}
