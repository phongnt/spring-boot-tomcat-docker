FROM tomcat:8.5.77-jre11-openjdk
COPY ./build/libs/mvc-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]