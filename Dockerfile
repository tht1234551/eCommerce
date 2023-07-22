FROM openjdk:11-jdk

# work dir
WORKDIR /home/backend

ADD build/libs/eCommerce-0.0.1-SNAPSHOT.jar docker-springboot.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-springboot.jar"]