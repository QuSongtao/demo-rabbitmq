package com.suncd.amqp.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 描述：RabbitMQ接收监听器
 * 两个监听器监听同一队列时，消息只会随机取出一次
 * 消息格式默认为byte[]格式，可在配置文件中设定为String格式
 *
 *
 * @author QUST
 * @version 1.0
 * @date 2017/5/9
 */
@Component
public class RabbitReceiver {

    /**
     * 监听器1
     * @param msg
     */
    @RabbitListener(queues = "gis.pms.queue")
    public void process(byte[] msg) {
        System.out.println("Receiver111  : " + new String(msg));
    }

    /**
     * 监听器2
     * @param msg
     */
    @RabbitListener(queues = "gis.pms.queue")
    public void process2(String msg) {
        System.out.println("Receiver222  : " + msg);
    }
}
