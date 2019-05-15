package com.smpd.appmeshouter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppmeshOuterApplication {

    @GetMapping
    public Response response(){
        return new Response();
    }

    public static void main(String[] args) {
        SpringApplication.run(AppmeshOuterApplication.class, args);
    }

}
