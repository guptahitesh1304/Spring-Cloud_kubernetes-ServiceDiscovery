package com.poc.sd.kubernetes.springcloud.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/view")
@RestController
public class WelcomeController {

    @Value("${message:Welcome to Youtube}")
    private String message;

    @Autowired
    VIEWServiceDiscoveryComponent vsdc;
    
    @GetMapping
    public String viewcontent() {
        System.out.println(message);
        return vsdc.servieDiscovery();
    }
}
