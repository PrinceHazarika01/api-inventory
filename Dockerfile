# Use Java 17 JDK base image
FROM eclipse-temurin:17-jdk-jammy

# Set working directory inside container
WORKDIR /app

# Copy the pre-built JAR from Maven build
COPY target/inventory-0.0.1-SNAPSHOT.jar app.jar

# Expose the Spring Boot default port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]