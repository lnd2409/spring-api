FROM tomcat:9.0.73
ADD target/learningspring-2.7.10.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
