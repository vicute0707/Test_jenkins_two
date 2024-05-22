FROM maven:3.8.5-openjdk-17
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/discovery-0.0.1-SNAPSHOT.jar discovery.jar
EXPOSE 8761
ENTRYPOINT exec java $JAVA_OPTS -jar discovery.jar
