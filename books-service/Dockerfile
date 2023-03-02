FROM openjdk:11-jdk
MAINTAINER Paulo Pigassi
WORKDIR /app
COPY target/books-service-0.0.1-SNAPSHOT.jar /app/books-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "books-service-0.0.1-SNAPSHOT.jar"]