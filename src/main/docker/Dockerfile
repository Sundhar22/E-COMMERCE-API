# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container
COPY target/ecommerce-1.0.0.jar ecommerce.jar

# Expose the port that your application runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "ecommerce.jar"]
