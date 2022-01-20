FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/service-proxy-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /proxy.jar
ENTRYPOINT ["java","-jar","/proxy.jar"]
EXPOSE 8079