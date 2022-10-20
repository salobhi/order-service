FROM eclipse-temurin:17
MAINTAINER Systems Limited

ARG JAR_FILE=target/OrderService-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]