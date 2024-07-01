package com.semicolon.stageone.utils;

import com.semicolon.stageone.dto.response.IpapiResponse;
import com.semicolon.stageone.dto.response.VisitorResponse;

public class ModelMapper {
    public static VisitorResponse map(IpapiResponse ipapiResponse) {
        VisitorResponse response = new VisitorResponse();
        response.setClientIp(ipapiResponse.getIp());
        response.setLocation(ipapiResponse.getCity());
        return response;
    }
}
