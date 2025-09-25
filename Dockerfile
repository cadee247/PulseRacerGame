FROM gradle:8.4-jdk17 AS build
COPY . /app
WORKDIR /app
RUN gradle build

FROM eclipse-temurin:17
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
CMD ["java", "-jar", "app.jar"]