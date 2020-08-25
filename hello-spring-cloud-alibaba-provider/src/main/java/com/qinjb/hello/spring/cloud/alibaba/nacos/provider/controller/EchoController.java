package com.qinjb.hello.spring.cloud.alibaba.nacos.provider.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @RequestMapping(value = "/echo/{string}" ,method = RequestMethod.GET)
    public String echo(@PathVariable String string){
        return "Hello Nacos Provider " + string;
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/port")
    public String getPort(){
        return "当前节点端口为：" + port;
    }

}
