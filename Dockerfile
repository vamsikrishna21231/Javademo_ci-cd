FROM openjdk:17-jdk-alpine

COPY ./target/Javaclass-1.0-SNAPSHOT.jar Javaclass.jar

ENTRYPOINT ["java" ,"-jar","/Javaclass.jar"]