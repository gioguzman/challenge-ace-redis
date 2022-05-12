# Add custom configuration
FROM ibmcom/mq AS mqserver
COPY create-queues.mqsc /etc/mqm/
ENTRYPOINT ["runmqdevserver"]
