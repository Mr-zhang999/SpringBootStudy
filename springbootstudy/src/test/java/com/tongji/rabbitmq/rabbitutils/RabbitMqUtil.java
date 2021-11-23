package com.tongji.rabbitmq.rabbitutils;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/*
 * @author ZhangChunyuan
 * @date 2021-11-23 10:55
 */public class RabbitMqUtil {
     public static Channel getChannel() throws IOException, TimeoutException {
         ConnectionFactory factory = new ConnectionFactory();
         factory.setHost("112.124.20.110");
         factory.setUsername("root");
         factory.setPassword("123456789");

         Connection connection = factory.newConnection();
         Channel channel = connection.createChannel();
         return channel;
     }
}
