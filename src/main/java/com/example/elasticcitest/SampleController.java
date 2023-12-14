package com.example.elasticcitest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class SampleController {


    @GetMapping("/test")
    public String testAPI() {
        return "API Test Successful - after deploy-v3";
    } // - after deploy

}