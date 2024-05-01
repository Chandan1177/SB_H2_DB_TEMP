FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package -DskipTests

FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /app/target/33_SB-REST_H2_DB_APP-0.0.1-SNAPSHOT.jar 33_SB-REST_H2_DB_APP.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "33_SB-REST_H2_DB_APP.jar"]
