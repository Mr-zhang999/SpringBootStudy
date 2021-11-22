package com.tongji.rabbitmq.hello;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

/*
 * @author ZhangChunyuan
 * @date 2021-11-22 20:17
 */public class Producer {
     private final static String QUEUE_NAME = "HELLO";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("112.124.20.110");
        connectionFactory.setUsername("root");
        connectionFactory.setPassword("123456789");

        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME,true,false,false,null);
        String message = "hello world";

        channel.basicPublish("",QUEUE_NAME,null,message.getBytes(StandardCharsets.UTF_8));

        System.out.println("OK");

    }
}
