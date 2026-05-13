package org.example.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/healthcheck")
public class HealthCheck {

    @GetMapping
    public String healthCheck() {
        return "OK";
    }

}