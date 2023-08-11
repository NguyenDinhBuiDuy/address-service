FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/address-0.0.1-SNAPSHOT.jar address.jar
ENTRYPOINT ["java","-jar","/address.jar"]
EXPOSE 8083