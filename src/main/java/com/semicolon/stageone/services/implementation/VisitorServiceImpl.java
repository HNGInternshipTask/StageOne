package com.semicolon.stageone.services.implementation;


import com.semicolon.stageone.dto.request.TemperatureRequest;
import com.semicolon.stageone.dto.request.VisitorRequest;
import com.semicolon.stageone.dto.response.TemperatureResponse;
import com.semicolon.stageone.dto.response.VisitorResponse;
import com.semicolon.stageone.exception.InternalServerError;
import com.semicolon.stageone.services.IpAddressService;
import com.semicolon.stageone.services.TemperatureService;
import com.semicolon.stageone.services.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class VisitorServiceImpl  implements VisitorService {

    @Autowired
    private IpAddressService ipAddressService;
    @Autowired
    private TemperatureService temperatureService;


    @Override
    public VisitorResponse getDetails(VisitorRequest request) throws IOException {
        VisitorResponse response = ipAddressService.getIp();
        TemperatureRequest tempRequest =  new TemperatureRequest();
        tempRequest.setCity_name(response.getLocation());
        TemperatureResponse tempResponse = temperatureService.getTemperature(tempRequest);
        if (tempResponse == null){
            throw new InternalServerError("Internal Server Error");
        }
        String greeting = String.format("Hello ,%s!, The temperature is %.2f degrees Celsius in %s", request.getVisitorName(),
                tempResponse.getMain().getTemp(), response.getLocation());
        response.setGreeting(greeting);
        return response;
    }
}
