# challenge-ace-redis
Challenge to integrate a service and save info in redis cache

### ⚠️Prerequisites ⚠️

* Pull image of the [redis](https://hub.docker.com/_/redis) and run

```
docker pull redis
docker run --name redis -p 6379:6379 redis
```

You should check and delete keys in container with follow commands:

```
docker exec -it redis redis-cli
KEYS *
FLUSHALL
```


### Installation

1. Run MQ container, follow [instructions here](image-ibm-mq/README.md).
2. Run redis adapter, follow [instructions here](redis-adapter/README.md).