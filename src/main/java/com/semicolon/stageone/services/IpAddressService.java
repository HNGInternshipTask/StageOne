package com.semicolon.stageone.services;

import com.semicolon.stageone.dto.response.VisitorResponse;

import java.io.IOException;

public interface IpAddressService {


    VisitorResponse getIp() throws IOException;
}
