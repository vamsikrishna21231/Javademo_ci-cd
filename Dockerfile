FROM openjdk:19

COPY ./target/Javaclass-1.0-SNAPSHOT.jar springbootdemo.jar

ENTRYPOINT ["java" ,"-jar","/springbootdemo.jar"]