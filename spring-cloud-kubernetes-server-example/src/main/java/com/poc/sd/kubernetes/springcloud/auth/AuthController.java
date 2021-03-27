package com.poc.sd.kubernetes.springcloud.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping
    public String getAuth() {
        return "This is Auth Service you are talking with";
    }
}
