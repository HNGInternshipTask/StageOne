package com.semicolon.stageone.services;

import com.semicolon.stageone.dto.request.VisitorRequest;
import com.semicolon.stageone.dto.response.VisitorResponse;

import java.io.IOException;

public interface VisitorService {
    VisitorResponse getDetails(VisitorRequest request) throws IOException;
}
