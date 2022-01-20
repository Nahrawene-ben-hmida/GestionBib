FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /register.jar
ENTRYPOINT ["java","-jar","/register.jar"]
EXPOSE 8761