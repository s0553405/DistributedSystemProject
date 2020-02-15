FROM hirokimatsumoto/alpine-openjdk-11

VOLUME /tmp

EXPOSE 80

COPY target/*.jar ratingService.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/ratingService.jar"]
