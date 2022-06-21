FROM openjdk:8
EXPOSE 8082
ADD target/spring-boot-bookstore-0.0.1-SNAPSHOT.jar spring-boot-bookstore-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-boot-bookstore-0.0.1-SNAPSHOT.jar"]