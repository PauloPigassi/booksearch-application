FROM openjdk:11-jdk
MAINTAINER Paulo Pigassi
WORKDIR /app
COPY target/application-server-0.0.1-SNAPSHOT.jar /app/application-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "application-server-0.0.1-SNAPSHOT.jar"]