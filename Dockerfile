FROM openjdk
EXPOSE 8080
ADD target/CICD-0.0.1-SNAPSHOT.jar cicd.jar
ENTRYPOINT [ "java" ,"-jar", "cicd.jar"]
