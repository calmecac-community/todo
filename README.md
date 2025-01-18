
# Proyecto TO DO 

Proyecto de administración de tareas enfocado al aprendizaje del framework Spring MVC.

## Contenido

* [Proyecto TO DO ](#proyecto-to-do-)
    * [Pre-requisitos](#pre-requisitos)
    * [Instalación y configuración del proyecto](#instalación-y-configuración-del-proyecto)
        * [Clonar el repositorio en Github](#clonar-el-repositorio-en-github)
    * [Clonar el repositorio](#clonar-el-repositorio)
    * [Cambiarse al repositorio descargado](#cambiarse-al-repositorio-descargado)
        * [Activar la base de datos mongodb](#activar-la-base-de-datos-mongodb)
        * [Levantar el proyecto con spring boot](#levantar-el-proyecto-con-spring-boot)
    * [Para linux o macos](#para-linux-o-macos)
    * [Para windows](#para-windows)
        * [Validar](#validar)
    * [Estructura del proyecto](#estructura-del-proyecto)
    * [Patron IoC](#patron-ioc)
    * [Principales anotaciones](#principales-anotaciones)
        * [La anotación @Controller](#la-anotación-@controller)
        * [La anotación @RequestMapping](#la-anotación-@requestmapping)
        * [La anotación @RequestParam](#la-anotación-@requestparam)
        * [La anotación @ModelAttribute](#la-anotación-@modelattribute)
        * [La anotación @PathVariable](#la-anotación-@pathvariable)
        * [La anotación @Value](#la-anotación-@value)
        * [La anotación @Autowired](#la-anotación-@autowired)
        * [La anotación @Qualifier](#la-anotación-@qualifier)
        * [La anotación @Primary](#la-anotación-@primary)
        * [La anotación @Configuration`](#la-anotación-@configuration)
        * [La anotaciones @Repository, @Service, @Controller](#la-anotaciones-@repository,-@service,-@controller)
        * [La anotaciones @Scanneo de componentes](#la-anotaciones-@scanneo-de-componentes)
        * [La anotaciones Recursos estáticos](#la-anotaciones-recursos-estáticos)

## Pre-requisitos
Para poder utilizar el repositorio actual, se deberá de cumplir con los siguientes requerimientos:

- [Open JDK 21](https://openjdk.org/projects/jdk/21/) o mayor
- [Docker](https://www.docker.com/get-started/)
- [Git](https://git-scm.com/downloads)
- [VSCode](https://code.visualstudio.com/download)
- [Mongo DB Compass](https://www.mongodb.com/products/tools/compass)
- Algún cliente Rest como: [Insomnia](https://insomnia.rest/), [Postman](https://www.postman.com/) o [CURL](https://curl.se/)


## Instalación y configuración del proyecto

Para implementar este proyecto ejecuta los siguientes pasos

### Clonar el repositorio en Github

Las siguientes operaciones se deberán de llevar a cabo a través de la línea de comandos:


```shell
## Clonar el repositorio
git clone git@github.com:calmecac-community/todo.git

## Cambiarse al repositorio descargado
cd todo
```

### Activar la base de datos mongodb

```shell
docker compose src/main/docker/mongodb.yml up -d
```

### Levantar el proyecto con spring boot

```shell
## Para linux o macos
./mvnw spring-boot:run

## Para windows
./mvnw.cmd spring-boot:run
```

### Validar

Abre un navegador web y coloca la siguiente ruta:

```shell
http://localhost:8080/api/info
```

En la página web, se debeŕa de ver un resutlado parecido al siguiente:

```json
{
  "appName": "todo",
  "description": "Demo project for Spring Boot",
  "version": "0.0.1-SNAPSHOT",
  "port": "8080"
}
```

## Estructura del proyecto

```shell
──src
  ├── main
  │   ├── docker
  │   ├── java
  │   │   └── mx
  │   │       └── calmecac
  │   │           └── todo
  │   │               ├── controllers
  │   │               ├── dtos
  │   │               ├── mappers
  │   │               ├── model
  │   │               ├── repositories
  │   │               └── services
  │   └── resources
  │       ├── static
  │       └── templates
  └── test
      └── java
          └── mx
              └── calmecac
                  └── todo
```


|  Directorio | Descripción  |
|---|---|
|`src/main/java/mx/calmecac/todo/controllers`| Controladores que atienden las peticiones HTTP de un request. Los archivos tienen el sifujo `Controler.java` |
|`src/main/java/mx/calmecac/todo/services`| Definición de las clases que implementan la lógica de negocio. Los archivos tienen el sufijo  `Service.java` |
|`src/main/java/mx/calmecac/todo/model`| Definición de las entidades que representan el modelo de dominio del proyecto|
|`src/main/java/mx/calmecac/todo/repositories`| Clases que acceden a la base de datos. Los archivos tienen el sufijo `Repository.java` |
|`src/main/java/mx/calmecac/todo/dtos`| Los archivos tienen el sufijo  `Dto.java` |
|`src/main/resources/static`| Se guardan los archivos utilizados en las vistas html del proyecto. Los archivos tienen extensiiones .png, .jpg, .svg, etc |
|`src/main/resources/templates`| Se guardan las plantillas de las vistas Thymeleaf. Aquí van los archivos con extensión `.html`
|`src/main/test`| Se guardan las clases que continenen las pruebas unitarias del proyecto


## Patron IoC
## Principales anotaciones
### La anotación @Controller
### La anotación @RequestMapping
### La anotación @RequestParam
### La anotación @ModelAttribute
### La anotación @PathVariable
### La anotación @Value
### La anotación @Autowired
### La anotación @Qualifier
### La anotación @Primary
### La anotación @Configuration`
### La anotaciones @Repository, @Service, @Controller
### La anotaciones @Scanneo de componentes
### La anotaciones Recursos estáticos
### La anotaciones RestControllerAdvicer

```java
@RestControllerAdvice
public class ExceptionErrorHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> generalError(Exception ex) {
        return ResponseEntity.internalServerError().body("Error general capturado");
    }

}

```


[![License: MIT](https://cdn.prod.website-files.com/5e0f1144930a8bc8aace526c/65dd9eb5aaca434fac4f1c34_License-MIT-blue.svg)](/LICENSE)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
