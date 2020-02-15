FROM hirokimatsumoto/alpine-openjdk-11

VOLUME /tmp

EXPOSE 8081

COPY target/*.jar userInterface.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/userInterface.jar"]
