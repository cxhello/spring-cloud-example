package com.cxhello.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cxhello
 * @date 2022/1/14
 */
@RefreshScope
@RestController
public class ProviderController {

    @Value("${name}")
    private String name;

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String test() {
        return name;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "cxhello",required = false) String name) {
        return "hello " + name + ", i'm provider ,my port:" + port;
    }

}
