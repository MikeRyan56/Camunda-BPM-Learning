FROM openjdk:8-jdk-alpine
MAINTAINER devsetgo.com
ENV VIRTUAL_HOST learning-camunda.devsetgo.com
ENV LETSENCRYPT_HOST learning-camunda.devsetgo.com
#VOLUME /tmp
#ADD target/learning-camunda.jar app.jar
COPY target/learning-camunda.jar app.jar
EXPOSE 8080
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/app.jar"]
#ENTRYPOINT ["java","-jar","/app.jar"]
