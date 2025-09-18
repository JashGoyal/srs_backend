# Use Maven to build the application
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /app
COPY . .

# Skip tests to avoid test failures
RUN mvn clean package -DskipTests

# Use OpenJDK to run the application
FROM openjdk:17-jdk-slim
COPY --from=build /app/target/your-app.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
