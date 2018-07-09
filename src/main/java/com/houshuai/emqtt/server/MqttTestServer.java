package com.houshuai.emqtt.server;

import org.springframework.integration.annotation.GatewayHeader;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;

/**
 * FileName: MqttTestServer
 * author:   候帅
 * data:     2018/7/9 21:35
 * Description: Mqtt传输使用
 * History:
 */
@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel"
//        , defaultHeaders = {@GatewayHeader(name = "tic", value = "PushException")}
        )
public interface MqttTestServer {
    void sendToMqtt(String data, @Header(MqttHeaders.TOPIC)String topic);
}
