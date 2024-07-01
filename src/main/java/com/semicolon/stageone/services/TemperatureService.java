package com.semicolon.stageone.services;

import com.semicolon.stageone.dto.request.TemperatureRequest;
import com.semicolon.stageone.dto.response.TemperatureResponse;

public interface TemperatureService {
    TemperatureResponse getTemperature(TemperatureRequest request);
}
