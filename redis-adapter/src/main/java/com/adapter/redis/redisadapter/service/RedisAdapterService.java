package com.adapter.redis.redisadapter.service;

import com.adapter.redis.redisadapter.model.RedisAdapterModel;

public interface RedisAdapterService {
    void sendMessageToRedis (RedisAdapterModel redisAdapterModel);
}
