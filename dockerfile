FROM anapsix/alpine-java

MAINTAINER Louzao

WORKDIR /home/app

COPY ./target/kotlin-boot-0.0.1-SNAPSHOT.jar /home/app

RUN java -jar /home/app/kotlin-boot-0.0.1-SNAPSHOT.jar