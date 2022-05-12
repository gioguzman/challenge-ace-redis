# redis-adapter-springboot

`mvn clean package`

`docker build -t redis-adapter .`

`docker run --name redis-adapter --env "IBM_MQ_CONN_NAME=host.docker.internal(1415)" -p 8080:8080 --network redis-network redis-adapter`
