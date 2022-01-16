package com.cxhello.consumer.controller;

import com.cxhello.consumer.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author cxhello
 * @date 2022/1/14
 */
@RefreshScope
@RestController
public class ConsumerController {

    @Value("${name}")
    private String name;

    @Resource
    private ProviderClient providerClient;

    @GetMapping("/test")
    public String test() {
        return name;
    }

    @GetMapping("/hi-feign")
    public String hiFeign(){
        return providerClient.hello("feign");
    }

}
