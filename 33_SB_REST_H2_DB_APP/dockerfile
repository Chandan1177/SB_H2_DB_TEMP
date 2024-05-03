# Use an OpenJDK image as the base image
FROM openjdk:17-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container at /app
COPY target/my-spring-boot-app.jar /app

# Expose the port that the Spring Boot application will run on
EXPOSE 8080

# Define the command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "my-spring-boot-app.jar"]

