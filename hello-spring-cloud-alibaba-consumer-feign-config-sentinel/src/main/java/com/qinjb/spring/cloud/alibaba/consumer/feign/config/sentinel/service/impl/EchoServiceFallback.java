package com.qinjb.spring.cloud.alibaba.consumer.feign.config.sentinel.service.impl;

import com.qinjb.spring.cloud.alibaba.consumer.feign.config.sentinel.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String testRest(String string) {
        return "testRest() 接口服务降级";
    }

    @Override
    public String port() {
        return "port() 接口服务降级";
    }
}
