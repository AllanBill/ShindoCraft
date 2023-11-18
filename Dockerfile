# Seleciona Java 8
FROM openjdk:8-jdk

WORKDIR /app

# Instalação de dependências (para gráficos)
RUN apt-get update && \
    apt-get install -y libglfw3

# Cria usuário menos privilegiado por segurança
RUN groupadd -r minecraft && useradd -r -g minecraft -m minecraft

# Copiar arquivos gradle
COPY ./gradlew /app
COPY gradle /app/gradle

# Instalar gradle
USER minecraft
RUN ./gradlew --version

# Permitir o Minecraft acessar gradle
COPY . /app
USER root
RUN chown -R minecraft:minecraft /app

# Construir o mod Minecraft e baixar os dados
USER minecraft
ENV EULA=true
RUN ./gradlew build runServer || true
RUN echo "eula=true" > ./run/eula.txt
USER root
RUN chown -R minecraft:minecraft /app/.gradle
# Consertar audio
RUN usermod -aG audio minecraft

CMD ["./gradlew", "build", "runServer"]
