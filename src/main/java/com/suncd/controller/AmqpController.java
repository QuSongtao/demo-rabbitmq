package com.suncd.controller;

import com.suncd.amqp.sender.RabbitSender;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：XXXXX
 *
 * @author QUST
 * @version 1.0
 * @date 2017/5/9
 */
@RestController
@RequestMapping("/amqp")
public class AmqpController {

    @Autowired
    private RabbitSender rabbitSender;

    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public String send(){
        return rabbitSender.send();
    }
}
