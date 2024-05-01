FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/33_SB-REST_H2_DB_APP-0.0.1-SNAPSHOT.jar 33_SB-REST_H2_DB_APP.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","33_SB-REST_H2_DB_APP.jar"]
