package com.semicolon.stageone.services.implementation;

import com.semicolon.stageone.dto.request.TemperatureRequest;
import com.semicolon.stageone.dto.response.TemperatureResponse;
import com.semicolon.stageone.services.TemperatureService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TemperatureServiceImpl implements TemperatureService {

    @Value("${openWeather.api.key}")
    private String openWeatherKey;
    @Value("${openWeather.base.url}")
    private String openBaseUrl;


    @Override
    public TemperatureResponse getTemperature(TemperatureRequest request) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("api-key", openWeatherKey);
        String completeUrl = openBaseUrl+ "appid=" + openWeatherKey +"&units=metric"+ "&q=" + request.getCity_name();
        ResponseEntity<TemperatureResponse> response = restTemplate.postForEntity(completeUrl,headers,
                TemperatureResponse.class);

        return response.getBody();
    }
}
