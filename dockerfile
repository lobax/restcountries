FROM tomcat:jdk8-openjdk-slim
COPY target/restcountries-2.0.5.war /usr/local/tomcat/webapps/
RUN rm                  /usr/local/tomcat/conf/tomcat-users.xml
RUN ls                  /usr/local/tomcat/conf/
RUN rm                  /usr/local/tomcat/webapps/manager/META-INF/context.xml
COPY tomcat-users.xml   /usr/local/tomcat/conf 
COPY context.xml        /usr/local/tomcat/webapps/manager/META-INF
EXPOSE 8080
CMD ["catalina.sh", "run"]

