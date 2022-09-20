package com.sein.restapi.health.controller;


import com.sein.restapi.health.dto.HealthCheckResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HealthCheckController {

    private final Environment environment;

        @RequestMapping("/health")
        public ResponseEntity<HealthCheckResponseDto> healthCheck() {
            HealthCheckResponseDto healthCheckResponseDto = HealthCheckResponseDto.builder()
                    .health("UP")
                    .activeProfiles(Arrays.asList(environment.getActiveProfiles()))
                    .build();
            return ResponseEntity.ok(healthCheckResponseDto);
        }
}
