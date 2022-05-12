package com.adapter.redis.redisadapter.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RedisAdapterModel {

    private ConfigModel config;
    private List<DataModel> data;
}
