package com.adapter.redis.redisadapter.service.impl;

import com.adapter.redis.redisadapter.model.DataModel;
import com.adapter.redis.redisadapter.model.RedisAdapterModel;
import com.adapter.redis.redisadapter.service.RedisAdapterService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Slf4j
@Service
public class RedisAdapterServiceImpl implements RedisAdapterService {

    @Override
    public void sendMessageToRedis(RedisAdapterModel redisAdapterModel) {
        //TODO: Crear pool de conexión (Singleton)
        Jedis jedis = new Jedis(redisAdapterModel.getConfig().getHost(), redisAdapterModel.getConfig().getPort());

        for (DataModel dataModel : redisAdapterModel.getData()){
            jedis.set(dataModel.getKey(), dataModel.getValue().toString());
        }

        jedis.close();
    }
}
