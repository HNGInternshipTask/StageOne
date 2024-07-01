package com.semicolon.stageone.controller;
import com.semicolon.stageone.dto.request.VisitorRequest;
import com.semicolon.stageone.dto.response.VisitorResponse;
import com.semicolon.stageone.exception.InternalServerError;
import com.semicolon.stageone.services.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class VisitorController {


    @Autowired
    private VisitorService visitorService;

    @GetMapping("/hello")
    public ResponseEntity<?> details(@ModelAttribute VisitorRequest visitorRequest) throws IOException {
        try {
            VisitorResponse response = visitorService.getDetails(visitorRequest);
            return ResponseEntity.ok().body(response);
        }catch (InternalServerError error){
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }
}

