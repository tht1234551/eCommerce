FROM openjdk:11-jdk

# work dir
WORKDIR /home/backend

CMD ["ls", "-al"]
ADD ./build/libs/eCommerce-0.0.1-SNAPSHOT.jar docker-springboot.jar
CMD ["ls", "-al"]

EXPOSE 8081

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-springboot.jar"]
