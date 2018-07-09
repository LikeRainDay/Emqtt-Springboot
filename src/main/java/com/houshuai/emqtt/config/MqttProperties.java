package com.houshuai.emqtt.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * FileName: MqttProperties
 * author:   候帅
 * data:     2018/7/9 21:43
 * Description: TODO
 * History:
 */
@Getter
@Setter
@ConfigurationProperties("spring.mqtt")
@Component
public class MqttProperties {

    private String username;

    private String password;

    private String hostUrl;

    private String clientId;

    private String defaultTopic;

}
