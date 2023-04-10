### BUILD image
FROM maven:3.8.6-openjdk-8 as builder
WORKDIR /usr/src/app
ADD . /usr/src/app
RUN mvn clean install -DSkipTests
COPY --from= /usr/src/app/*.war /app/learning.war
FROM tomcat:9.0.73
EXPOSE 8080
CMD ["catalina.sh", "run"]
