package com.qinjb.spring.cloud.alibaba.consumer.feign.config.sentinel.controller;


import com.qinjb.spring.cloud.alibaba.consumer.feign.config.sentinel.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope  //打开分布式配置动态刷新功能
@RestController
public class NacosConfigConttoller {

    @Autowired
    private EchoService echoService;

    @Value("${user.name}")
    private String ConfigName;

    @GetMapping(value = "/config")
    public String config() {
        return echoService.testRest(ConfigName);
    }

}
