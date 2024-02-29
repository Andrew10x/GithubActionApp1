FROM openjdk:21
ADD target/github-action.jar github-action.jar
ENTRYPOINT ["java", "-jar", "/github-action.jar"]
