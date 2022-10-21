FROM ashu0183/openjdk-11-rhel7-rhel
USER root
WORKDIR /app
COPY target/authentication.jar app.jar
COPY .docker/wait-for-it.sh /wait-for-it.sh
RUN chmod +x /wait-for-it.sh
ENV JVM_OPT $JVM_OPT
EXPOSE 8080
EXPOSE 5005
ENTRYPOINT java $JVM_OPT -jar app.jar