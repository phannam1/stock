FROM maven:3.6.1-jdk-11-slim AS build
COPY . .
RUN mvn -f /pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /stock-service/target/stock-service-0.0.1-SNAPSHOT.jar /stock.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","/stock.jar"]
