package com.cxhello.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author cxhello
 * @date 2022/1/14
 */
@FeignClient(value = "provider")
public interface ProviderClient {

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name", defaultValue = "cxhello", required = false) String name);

}
