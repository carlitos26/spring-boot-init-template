FROM maven:3.6.2-jdk-11-slim
MAINTAINER Carlo Butelli <>

ADD . /code
WORKDIR /code

EXPOSE 8081

RUN apt-get update &&\
    apt-get dist-upgrade -y &&\
    apt-get clean &&\
    apt-get autoclean &&\
    rm -rf /var/lib/apt/lists/* && \
    update-ca-certificates -f && \
    /var/lib/dpkg/info/ca-certificates-java.postinst configure

RUN mvn dependency:tree
RUN mvn package -DskipTests

RUN chmod 755 /code/docker-entrypoint.sh
ENTRYPOINT ["/code/docker-entrypoint.sh"]
CMD ["run"]