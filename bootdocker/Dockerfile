FROM adoptopenjdk/openjdk8:latest
RUN mkdir /usr/src/bootdocker
COPY empleado-0.0.1-SNAPSHOT.jar /usr/src/bootdocker/empleado-0.0.1-SNAPSHOT.jar
WORKDIR /usr/src/bootdocker
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "/usr/src/bootdocker/empleado-0.0.1-SNAPSHOT.jar"]