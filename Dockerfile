# ステージ1: ビルド
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY StudyProjects/HelloSpringBoot /app
RUN mvn package -DskipTests

# ステージ2: 実行
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/hello-springboot-0.0.1-SNAPSHOT.jar /app/hello-springboot.jar
CMD ["java", "-jar", "hello-springboot.jar"]
