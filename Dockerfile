FROM adoptopenjdk/openjdk8
VOLUME /tmp
ADD demo-0.0.1-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8766