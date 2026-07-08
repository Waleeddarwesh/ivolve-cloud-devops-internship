FROM maven:3.9.8-eclipse-temurin-17 AS builder

WORKDIR /app

# Copy application source code
COPY . .

# Build the Spring Boot application
RUN mvn clean package -DskipTests

# ---------- Stage 2: Runtime ----------
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy the generated JAR from the builder stage
COPY --from=builder /app/target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]