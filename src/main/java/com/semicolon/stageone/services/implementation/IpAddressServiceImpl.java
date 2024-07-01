package com.semicolon.stageone.services.implementation;

import com.semicolon.stageone.dto.response.IpapiResponse;
import com.semicolon.stageone.dto.response.VisitorResponse;
import com.semicolon.stageone.exception.InternalServerError;
import com.semicolon.stageone.services.IpAddressService;
import com.semicolon.stageone.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IpAddressServiceImpl implements IpAddressService {

    @Value("${ipapi.base.url}")
    private String ipapiBaseUrl;

    @Override
    public VisitorResponse getIp() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "java-ipapi-v1.02");
        IpapiResponse ipapiResponse = restTemplate.getForObject(ipapiBaseUrl,IpapiResponse.class,headers);
        if (ipapiResponse == null){
            throw new InternalServerError("Internal Server Error");
        }
        return ModelMapper.map(ipapiResponse);
    }
}
