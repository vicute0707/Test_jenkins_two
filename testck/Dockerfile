FROM maven:3.8.5-openjdk-17
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/testck-0.0.1-SNAPSHOT.jar testck.jar
EXPOSE 8761
ENTRYPOINT exec java $JAVA_OPTS -jar testck.jar
