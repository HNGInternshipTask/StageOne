package com.semicolon.stageone.services;


import com.semicolon.stageone.dto.request.VisitorRequest;
import com.semicolon.stageone.dto.response.VisitorResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class VisitorServiceTest {


    @Autowired
    public VisitorService visitorService;


    @Test
    public void testEndpoint() throws IOException {
        VisitorRequest request = new VisitorRequest();
        request.setVisitorName("Qudus");
        VisitorResponse response = visitorService.getDetails(request);
        System.out.println(response.toString());
        assertThat(response).isNotNull();
    }

}
