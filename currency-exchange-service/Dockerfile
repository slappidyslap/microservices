FROM openjdk:17-alpine
ADD target/*.jar app.jar
EXPOSE 8000
CMD sleep 20
ENTRYPOINT ["java","-jar","/app.jar"]