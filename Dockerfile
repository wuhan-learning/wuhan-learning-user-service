FROM jboss/base-jdk:8
MAINTAINER honglai <hlzhan@thoughtworks.com>

COPY build/libs/user-service-0.0.1-SNAPSHOT.jar /app/user-service-0.0.1.jar
WORKDIR /app

CMD ["-jar", "user-service-0.0.1.jar"]