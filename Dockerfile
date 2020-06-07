FROM openjdk:8-jdk-alpine
VOLUME biblioteca
EXPOSE 8081
ADD target/**.jar spring.jar
ENTRYPOINT ["java","-jar","/spring.jar"]