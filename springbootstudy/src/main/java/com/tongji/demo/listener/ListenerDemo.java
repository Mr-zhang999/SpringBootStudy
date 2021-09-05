package com.tongji.demo.listener;

import com.tongji.demo.event.EventDemo;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author zhangchunyuan
 * @date 2021/8/12 4:08 下午
 */
@Component
public class ListenerDemo  {
    @EventListener
    public void onApplicationEvent(EventDemo eventDemo){
        System.out.println(">>>>>>>>>>>>>>>>>>>>DemoListener>>>>>>>>>>>>>>>>>");
        System.out.println("收到了：" + eventDemo.getSource() + "消息；时间：" + eventDemo.getTimestamp());
        System.out.println("消息：" + eventDemo.getId() + ":" + eventDemo.getMessage());
    }
}
