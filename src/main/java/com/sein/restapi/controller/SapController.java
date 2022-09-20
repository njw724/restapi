package com.sein.restapi.controller;

import com.sein.restapi.client.SapClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sap")
@RequiredArgsConstructor
public class SapController {
    private final SapClient sapServiceClient;


    @PostMapping("/test")
    public void test() {
        Object request = sapServiceClient.request("200");
        System.out.println(request);
    }
}
