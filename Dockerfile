FROM java:8
MAINTAINER Thiago <thiago.carvp@gmail.com>

ADD target/uberjar/componentization-0.0.1-SNAPSHOT-standalone.jar /componentization/app.jar

EXPOSE 8080

CMD ["java", "-jar", "/componentization/app.jar"]
