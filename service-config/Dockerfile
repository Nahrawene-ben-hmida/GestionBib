FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /config.jar
ENTRYPOINT ["java","-jar","/config.jar"]