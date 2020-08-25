package com.qinjb.spring.cloud.alibaba.consumer.feign.config.sentinel.service;

import com.qinjb.spring.cloud.alibaba.consumer.feign.config.sentinel.service.impl.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  通过 @FeignClient("服务名") 注解来指定调用哪个服务
 */


@FeignClient(value = "service-provider",fallback = EchoServiceFallback.class)
public interface EchoService {

    @RequestMapping(value = "/echo/{string}")
    String testRest(@PathVariable("string") String string);

    @RequestMapping(value = "/port")
    String port();
}
