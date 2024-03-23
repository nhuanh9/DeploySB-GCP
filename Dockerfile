FROM openjdk:17-slim
WORKDIR /app
COPY build/libs/DemoSB1-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -jar /app/app.jar"]
