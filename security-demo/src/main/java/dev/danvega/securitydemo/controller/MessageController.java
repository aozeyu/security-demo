package dev.danvega.securitydemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaozeyu
 */
@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @GetMapping("/hello")
    public String hello() {
        return "Full Stack Project";
    }
}
