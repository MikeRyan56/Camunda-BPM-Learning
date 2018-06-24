#FROM tomcat:8.0
FROM openjdk:8
VOLUME /tmp
#VOLUME /app
MAINTAINER Stu Ryan <mrstu@live.com>
ADD target/learning-camunda.jar app.jar
EXPOSE 8090
#RUN rm -fr /usr/local/tomcat/webapps/ROOT
#COPY target/learning-camunda.war /usr/local/tomcat/webapps/ROOT
#ENTRYPOINT ["java", "-jar", "/app.war"]
#COPY /src/main/webapp/ /app
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]