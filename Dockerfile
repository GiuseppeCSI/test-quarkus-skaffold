FROM docker-base.ecosis.csi.it/maven:3.6.3_1.0 as builder
COPY . /usr/src/mymaven
WORKDIR /usr/src/mymaven
RUN env
RUN cat .mvn/conf/settings.xml
RUN mvn package --settings .mvn/conf/settings.xml -Dmaven.test.skip=true

FROM docker-trusted.ecosis.csi.it/adoptopenjdk:11.0.10_9-jdk-hotspot

RUN mkdir /deployments \
    && chown 1001 /deployments \
    && chmod "g+rwX" /deployments \
    && chown 1001:root /deployments
COPY  ./run-java.sh /deployments/run-java.sh

RUN chown 1001 /deployments/run-java.sh \
    && chmod 540 /deployments/run-java.sh 
#    && echo "securerandom.source=file:/dev/urandom" >> /etc/alternatives/jre/lib/security/java.security

COPY --from=builder /usr/src/mymaven/target/lib/* /deployments/lib/
COPY --from=builder /usr/src/mymaven/target/*-runner.jar /deployments/app.jar

ENV JAVA_OPTIONS="-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"
EXPOSE 8080
USER 1001

ENTRYPOINT [ "/deployments/run-java.sh" ]
