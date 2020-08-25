package com.qinjb.spring.cloud.alibaba.consumer.nacos.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NacosConsumerController {

    private final RestTemplate restTemplate;


    @Autowired
    public NacosConsumerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "/echo/{string}",method = RequestMethod.GET)
    public String echo(@PathVariable String string){

        // 使用服务名请求服务提供者
        return restTemplate.getForObject("http://service-provider/echo" + string,String.class);
    }

    @RequestMapping(value = "/test/{string}",method = RequestMethod.GET)
    public String test(@PathVariable String string){
        return "test" + string;
    }
}
