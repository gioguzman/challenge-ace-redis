FROM openjdk:12
EXPOSE 8080
ADD target/redis-adapter-0.0.1-SNAPSHOT.jar redis-adapter.jar
ENTRYPOINT ["java","-jar","/redis-adapter.jar"]