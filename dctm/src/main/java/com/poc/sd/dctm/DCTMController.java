package com.poc.sd.dctm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/dctm")
public class DCTMController {
	
	@Autowired
	DCTMServiceDiscoveryComponent dctmsvccmpt;

    @GetMapping
    public String dctm() {
    	System.out.println("This is DCTM you are talking with");
        return dctmsvccmpt.servieDiscovery();
    }
}

