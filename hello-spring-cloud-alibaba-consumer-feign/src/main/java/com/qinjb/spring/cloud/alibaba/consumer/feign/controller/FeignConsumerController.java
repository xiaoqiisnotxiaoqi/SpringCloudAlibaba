package com.qinjb.spring.cloud.alibaba.consumer.feign.controller;


import com.qinjb.spring.cloud.alibaba.consumer.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {


    @Autowired
    private EchoService echoService;

    @RequestMapping(value = "/feign/consumer/{string}")
    public String echo(@PathVariable("string") String string){
        return  echoService.testRest(string);
    }



    @RequestMapping(value = "/port",method = RequestMethod.GET)
    public String port(){
        return echoService.port();
    }
}
