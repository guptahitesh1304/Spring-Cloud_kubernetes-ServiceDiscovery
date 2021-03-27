package com.poc.sd.kubernetes.springcloud.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class VIEWServiceDiscoveryComponent {

//    @Autowired
//    WelcomeConfiguration config;

    @Autowired
    RestTemplate restTemplate;


    public String servieDiscoveryAuth() {
        //System.out.println(config.getMessage());

        String url = "http://auth-service:8080/auth";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        System.out.println("Calling Auth Service via Discovery Client from View Service.... " + responseEntity.getBody());
		return responseEntity.getBody();
    }
    public String servieDiscoveryAppConfig() {
        //System.out.println(config.getMessage());

        String url = "http://appconfig-service:8080/appconfig";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        System.out.println("Calling AppConfig via Discovery Client from View Service.... " + responseEntity.getBody());
		return responseEntity.getBody();
    }
    public String servieDiscoveryDCTM() {
        //System.out.println(config.getMessage());

        String url = "http://dctm-service:8080/dctm";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        System.out.println("Calling via dctm Discovery Client from View Service.... " + responseEntity.getBody());
		return responseEntity.getBody();
    }
    public String servieDiscovery() {
        System.out.println("servieDiscovery()");

		return servieDiscoveryAuth()+servieDiscoveryAppConfig()+servieDiscoveryDCTM();
    }
}
