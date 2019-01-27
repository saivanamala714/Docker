FROM java:8
WORKDIR /
ARG JAR_FILE=target/DockerBoot-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} DockerBoot.jar
CMD java -jar DockerBoot.jar