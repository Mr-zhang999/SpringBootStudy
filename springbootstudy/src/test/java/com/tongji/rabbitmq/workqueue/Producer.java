package com.tongji.rabbitmq.workqueue;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;
import com.tongji.rabbitmq.rabbitutils.RabbitMqUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

/*
 * @author ZhangChunyuan
 * @date 2021-11-23 11:01
 */
public class Producer {

    private static final String QUEUE_NAME = "HELLO";

    public static void main(String[] args) throws IOException, TimeoutException {
        Channel channel = RabbitMqUtil.getChannel();


        channel.queueDeclare(QUEUE_NAME, true, false, false, null);
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String message = sc.nextLine();
            channel.basicPublish("", QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN, message.getBytes(StandardCharsets.UTF_8));
            System.out.println("message send over:" + message);
        }

    }
}
