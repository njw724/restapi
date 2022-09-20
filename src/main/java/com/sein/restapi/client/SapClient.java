package com.sein.restapi.client;

import com.sein.restapi.config.FeignClientConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.cloud.openfeign.FeignClient(name = "sap", url = "http://localhost:8080/api", configuration = {FeignClientConfiguration.class})
public interface SapClient {
    @PostMapping("/test")
    Object request(@RequestParam String text);


}
