FROM openjdk:8
EXPOSE 8081
ADD target/api_1.jar api_1.jar
ENTRYPOINT ["java", "-jar", "/api_1.jar"]