package com.adapter.redis.redisadapter.controller;

import com.adapter.redis.redisadapter.model.RedisAdapterModel;
import com.adapter.redis.redisadapter.service.RedisAdapterService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

@Slf4j
@Service
public class RedisAdapterController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private RedisAdapterService redisAdapterService;

    @JmsListener(destination = "ADP.INT.REDIS.IN")
    public void recieveMessage(Message message) {
        try {
            TextMessage textMessage = (TextMessage) message;
            final String textMessageBody = textMessage.getText();
            log.info("Message: {} with correlationId: {}", textMessageBody, textMessage.getJMSCorrelationID());
            RedisAdapterModel redisAdapterModel = new ObjectMapper().readValue(textMessageBody, RedisAdapterModel.class);
            redisAdapterService.sendMessageToRedis(redisAdapterModel);
        }catch (Exception ex) {
            //TODO: Manejo de errores
            log.info("The message was not set. Error message: {}", ex.getMessage());
        }

    }
}
