FROM logstash:8.6.2
# Pipeline pointing configuration
COPY ./logstash.conf /usr/share/logstash/pipeline/

# Configuration pipeline and monitoring elasticsearch for sending logs 
COPY ./logstash.yml /usr/share/logstash/config/

