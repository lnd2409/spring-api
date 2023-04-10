### BUILD image
FROM maven:3.8.6-openjdk-8 as builder
RUN mvn clean install -DSkipTests

FROM tomcat:9.0.73
ADD target/learningspring-2.7.10.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
