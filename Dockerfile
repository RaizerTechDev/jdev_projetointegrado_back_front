#
# Build stage
#
FROM maven:3.8.2-jdk-11 AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:11-jdk-slim
COPY --from=build /target/springboot-rest-api-sample-1.0.0-SNAPSHOT
# ENV PORT=8080
EXPOSE 8081
ENTRYPOINT ["java","-jar","demo.jar"]
