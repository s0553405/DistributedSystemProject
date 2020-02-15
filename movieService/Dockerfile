FROM hirokimatsumoto/alpine-openjdk-11

VOLUME /tmp

EXPOSE 8083

COPY target/*.jar movieService.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/movieService.jar"]
