# prepare img
FROM openjdk:8-jdk

WORKDIR /app

# instalar gradle
COPY ./gradlew /app
COPY gradle /app/gradle
RUN ./gradlew --version

# Instalação de dependências
RUN apt-get update && \
    apt-get install -y libglfw3

# Construir o mod Minecraft e baixar os dados
COPY . /app

ENV EULA=true

RUN ./gradlew build runServer || true
RUN echo "eula=true" > ./run/eula.txt

CMD ["./gradlew", "build", "runServer"]
