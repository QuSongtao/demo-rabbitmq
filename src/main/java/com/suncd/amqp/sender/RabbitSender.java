package com.suncd.amqp.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 描述：RabbitMQ消息生产者，发送消息，同时回调confirm方法
 *
 * @author QUST
 * @version 1.0
 * @date 2017/5/9
 */
@Component
public class RabbitSender implements RabbitTemplate.ConfirmCallback {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public String send(){
        //设置回调处理类
        rabbitTemplate.setConfirmCallback(this);
        //发送消息-字符串格式
        rabbitTemplate.convertAndSend("epm-gateway-usercenter-directExchange","AuthorizeService","hcplgx");
        //发送消息-字节格式
        rabbitTemplate.convertAndSend("epm-gateway-usercenter-directExchange","AuthorizeService","hcplgx".getBytes());
        return "ok";
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        if(b){
            System.out.println("send ok!");
        }else{
            System.out.println("send fail!");
        }
    }
}
