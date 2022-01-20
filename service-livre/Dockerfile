FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/service-Livre-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} livre.jar
ENTRYPOINT ["java","-jar","/livre.jar"]