FROM anapsix/alpine-java
MAINTAINER pmoriarty
COPY ./out/artifacts/JavaChallenge_jar/JavaChallenge.jar /home/jarjar.jar
CMD ["java","-jar","/home/jarjar.jar"]