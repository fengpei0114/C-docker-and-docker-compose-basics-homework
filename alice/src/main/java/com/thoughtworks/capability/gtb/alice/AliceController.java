package com.thoughtworks.capability.gtb.alice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AliceController {

    @GetMapping(path="/hello")
    public String hello(){
        String re String requestToBobUrl = "http://bob:8081/hello";

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(requestToBobUrl, String.class);
    }

}
