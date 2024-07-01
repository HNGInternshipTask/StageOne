package com.semicolon.stageone.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class VisitorResponse {

    private String clientIp;
    private String location;
    private String greeting;
}
