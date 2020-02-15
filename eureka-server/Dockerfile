FROM hirokimatsumoto/alpine-openjdk-11

VOLUME /tmp

EXPOSE 8761

COPY target/*.jar eureka-server.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/eureka-server.jar"]
