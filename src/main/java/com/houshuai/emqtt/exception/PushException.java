package com.houshuai.emqtt.exception;

/**
 * FileName: PushException
 *
 * author: 候帅
 * data: 2018/7/9 21:08
 * Description: 向上抛推送异常
 * History:
 */

public class PushException extends RuntimeException {
    public PushException(String message) {
        super(message);
    }

}
