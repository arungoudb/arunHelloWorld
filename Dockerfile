FROM openjdk:17-jdk-alpine
VOLUME /temp
ADD build/libs/demo-0.0.1-SNAPSHOT.jar app.jar
RUN touch /app.jar
CMD ["/bin/sh", "-c", "java -jar app.jar"]