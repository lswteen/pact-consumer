package com.pact.consumer.sample;

import com.pact.consumer.sample.port.SampleInfrastructurePort;
import com.pact.consumer.sample.service.SampleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SampleServiceTest {

    @Mock
    private SampleInfrastructurePort port;

    @InjectMocks
    private SampleService sampleService;

    @BeforeEach
    public void setUp() {
        System.out.println("setUp");
    }

    @Test
    void find_by_id(){
        //given
        var id = 1L;
        var sampleResult = SampleInfrastructurePort.Sample.builder()
                .id(1L)
                .name("test_name_1")
                .info("test_info_1")
                .build();

//        given(port.save(sampleResult)).willReturn(sampleResult);

//        given(port.findById(id)).willReturn(sampleResult);
        when(port.findById(1L)).thenReturn(sampleResult);

        //when
//        var result = sampleService.findById(id);

    }
}

