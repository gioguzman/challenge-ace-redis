package com.adapter.redis.redisadapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class RedisAdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisAdapterApplication.class, args);
    }

}
