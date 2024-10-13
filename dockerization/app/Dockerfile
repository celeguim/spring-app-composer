FROM openjdk:11 AS BUILD_STAGE
RUN apt update && apt install maven -y
RUN git clone https://github.com/celeguim/spring-app-composer.git
RUN cd spring-app-composer && mvn package 

FROM tomcat:9-jre11
LABEL "Project"="Spring-Stack"
LABEL "Author"="Luiz Celeghin"
RUN rm -rf /usr/local/tomcat/webapps/*
COPY --from=BUILD_STAGE spring-app-composer/target/spring-stack-v1.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]
