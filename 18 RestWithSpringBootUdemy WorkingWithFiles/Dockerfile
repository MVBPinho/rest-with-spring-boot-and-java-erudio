FROM eclipse-temurin:17-jdk-alpine

# Argumento para especificar o caminho do arquivo JAR
ARG JAR_FILE=target/rest-with-spring-boot-and-java-erudio-0.0.1-SNAPSHOT.jar

# Copiar o arquivo JAR para o diretório de trabalho do container
COPY ${JAR_FILE} /app/app.jar

# Comando para rodar o arquivo JAR
ENTRYPOINT ["java", "-jar", "/app/app.jar"]