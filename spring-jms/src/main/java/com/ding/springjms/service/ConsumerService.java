package com.ding.springjms.service;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;


@Service
public class ConsumerService {

    @Resource(name = "jmsTemplate")
    private JmsTemplate jmsTemplate;

    /**
     * 接收消息
     */
    public TextMessage receive(Destination destination) {
        TextMessage tm = (TextMessage) jmsTemplate.receive(destination);
        try {
            if (tm != null){
                System.out.println("从队列" + destination.toString() + "收到了消息：\t" + tm.getText());
            }else  {
                System.out.println("没有收到消息");
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }
        return tm;
    }

}
