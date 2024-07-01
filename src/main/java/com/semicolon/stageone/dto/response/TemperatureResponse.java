package com.semicolon.stageone.dto.response;


import com.semicolon.stageone.dto.request.MainWeatherData;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TemperatureResponse {

    private MainWeatherData main;
}
