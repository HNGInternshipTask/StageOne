package com.semicolon.stageone.services;

import com.semicolon.stageone.dto.request.TemperatureRequest;
import com.semicolon.stageone.dto.response.TemperatureResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TemperatureServiceTest {

    @Autowired
    private TemperatureService temperatureService;

    @Test
    public void getTemperatureTest(){

        TemperatureRequest request = new TemperatureRequest();
        request.setCity_name("Lagos");
        TemperatureResponse response = temperatureService.getTemperature(request);
        assertThat(response).isNotNull();
    }
}
