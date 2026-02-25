# Use Java 17 JDK base image
FROM eclipse-temurin:17-jdk-jammy

# Set working directory inside container
WORKDIR /app

# Copy Maven project files
COPY pom.xml .
COPY src ./src

# Build the project
# If you have Maven wrapper (mvnw)
RUN ./mvnw clean package -DskipTests

# If you don't have mvnw, use:
# RUN mvn clean package -DskipTests

# Expose the default Spring Boot port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "target/inventory-0.0.1-SNAPSHOT.jar"]