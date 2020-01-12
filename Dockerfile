FROM openjdk:latest
EXPOSE 8080
COPY build/libs/*.jar /service.jar
CMD java -jar /service.jar