### BUILD image
FROM maven:3.8.6-openjdk-8 as builder
WORKDIR /usr/src/app
ADD . /usr/src/app
RUN mvn clean install -DSkipTests
FROM tomcat:9.0.73
WORKDIR /usr/local/tomcat/webapps/
COPY --from=builder /usr/src/app/target/learningspring.war /usr/local/tomcat/webapps/todos.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
