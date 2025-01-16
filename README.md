
# Proyecto TO DO 

Proyecto de administración de tareas enfocado al aprendizaje del framework Spring MVC.


## Deployment

Para implementar este proyecto ejecuta los siguientes pasos

### 1. Activar la base de datos mongodb

```shell
  docker compose src/main/docker/mongodb.yml up -d
```

### 2. Levantar el servidor

```shell
## Para linux o macos
  ./mvnw spring-boot:run

## Para windows
  ./mvnw.cmd spring-boot:run
```

### 3. Validar

Abre un navegador web y coloca la siguiente ruta:

```shell
http://localhost:8080/api/info
```

El servicio deberá de regresar un objeto con información parecida a la siguiente:

```json
{
  "appName": "todo",
  "description": "Demo project for Spring Boot",
  "version": "0.0.1-SNAPSHOT",
  "port": "8080"
}
```

[![License: MIT](https://cdn.prod.website-files.com/5e0f1144930a8bc8aace526c/65dd9eb5aaca434fac4f1c34_License-MIT-blue.svg)](/LICENSE)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
