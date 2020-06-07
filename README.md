# Biblioteca API

## Passo a Passo para a execução

### 1 - Executar o build da aplicação spring
> mvn package -DskipTests
### 2 - Executar o Docker Compose 
> docker-compose up

## Rodando Frontend + Backend

Ao clonar os projetos garanta que ambos estejam na mesma página 
```
/pasta-raiz
--------(frontend)[https://github.com/jequelia/biblioteca_web.git]
--------(backend)[https://github.com/jequelia/biblioteca_api.git]
```
Abra o terminal na pasta raiz e execute o seguinte comando 

> docker-compose -f biblioteca_web/docker-compose.yml -f biblioteca_api/docker-compose.yml config