package com.houshuai.emqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;

/**
 * {@link IntegrationComponentScan} 进行扫描 integ生命的注解并实现
 *
 */
@SpringBootApplication
@IntegrationComponentScan
public class EmqttApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmqttApplication.class, args);
    }
}
