# redis-adapter-springboot

`docker build -t mqserver .`

`docker network create redis-network`

`docker run --name mqserver --env LICENSE=accept --env MQ_QMGR_NAME=QM1 --publish 1415:1414 --publish 9443:9443 --network redis-network mqserver`