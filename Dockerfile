FROM openjdk:17 as demo
ADD build/libs/demo.jar  demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo.jar"]