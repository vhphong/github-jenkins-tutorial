FROM openjdk:17
EXPOSE 8080
ADD target/github-jenkins-tutorial-sample.jar github-jenkins-tutorial-sample.jar
ENTRYPOINT ["java","-jar","/github-jenkins-tutorial-sample.jar"]