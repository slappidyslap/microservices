FROM openjdk:17-alpine
ADD target/*.jar app.jar
EXPOSE 8765
CMD sleep 20
ENTRYPOINT ["java","-jar","/app.jar"]