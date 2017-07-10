package com.suncd.system;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能：XXXXX
 *
 * @author qust
 * @version 1.0  2017/7/6
 */
@Configuration
public class RabbitMQConfig {
//    @Bean
//    public DirectExchange directExchange() {
//        return new DirectExchange("sys.syn1");
//    }
//
//    @Bean("usersQueueInsert")
//    public Queue usersQueueInsert() {
//        return new Queue("sys.syn.business.roles.xxxxxxx" , true, false, false);
//    }
//
//    @Bean
//    public Binding bindingRolesInsert(DirectExchange directExchange, @Qualifier("usersQueueInsert") Queue directQueue) {
//        return BindingBuilder.bind(directQueue).to(directExchange).with("sys.syn.business.roles.xxxxxxx");
//    }
}
