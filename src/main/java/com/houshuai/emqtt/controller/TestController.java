package com.houshuai.emqtt.controller;

import com.houshuai.emqtt.server.MqttTestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: TestController
 * author:   候帅
 * data:     2018/7/9 21:34
 * Description: TODO
 * History:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private MqttTestServer mqttTestServer;

    @GetMapping("/sendMq")
    public  String sendMqtt(String sendData){
        mqttTestServer.sendToMqtt(sendData, "hello");
        return "send success";
    }


}
