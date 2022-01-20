FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/service-cadres-admin-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /cadre-admin.jar
ENTRYPOINT ["java","-jar","/cadre-admin.jar"]