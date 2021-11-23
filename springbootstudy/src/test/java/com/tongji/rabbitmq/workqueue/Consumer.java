package com.tongji.rabbitmq.workqueue;

import com.rabbitmq.client.CancelCallback;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;
import com.rabbitmq.client.Delivery;
import com.tongji.rabbitmq.rabbitutils.RabbitMqUtil;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/*
 * @author ZhangChunyuan
 * @date 2021-11-23 11:09
 */public class Consumer {

     private static final String QUEUE_NAME = "HELLO";

    public static void main(String[] args) throws IOException, TimeoutException {
        Channel channel = RabbitMqUtil.getChannel();
        DeliverCallback deliverCallback = (consumerTag,deliverMessage)->{
            String message = new String(deliverMessage.getBody());
            System.out.println("receive:"+message);
        };
        CancelCallback cancelCallback = (consumerTag)-> System.out.println(consumerTag+"消费者取消消费接口回调逻辑");

        System.out.println("等待接收消息");
        channel.basicConsume(QUEUE_NAME,true,deliverCallback,cancelCallback);
    }
}
