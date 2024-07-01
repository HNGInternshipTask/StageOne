package com.semicolon.stageone.services;

import com.semicolon.stageone.dto.response.VisitorResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class IpAddressServiceTest {

    @Autowired
    private IpAddressService ipAddressService;

    @Test
    public void getIpAddressTest() throws IOException {
        VisitorResponse response = ipAddressService.getIp();
        assertThat(response).isNotNull();
    }
}
