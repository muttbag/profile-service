FROM openjdk:latest

ADD /var/lib/jenkins/workspace/profile-service-deploytarget/profile-service-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8082
