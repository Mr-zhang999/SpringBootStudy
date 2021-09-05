package com.tongji.demo.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author zhangchunyuan
 * @date 2021/8/12 3:56 下午
 */
public class EventDemo extends ApplicationEvent {
    private Long id;
    private String message;

    public EventDemo(Object source, Long id, String message) {
        super(source);
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "eventDemo{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
