# Level 1

## Spring and Maven Exercise

This exercise is an introduction to working with Spring and Maven.

---

### Project Generation

Go to [https://start.spring.io/](https://start.spring.io/) and generate a Spring Boot project with the following characteristics:

- **PROJECT (Dependency Management):** Maven  
- **LANGUAGE:** Java  
- **SPRING BOOT:** The latest stable version  
- **PROJECT METADATA:**  
  - Group: `cat.itacademy.s04.t01.n01`  
  - Artifact: `S04T01N01`  
  - Name: `S04T01N01`  
  - Description: `S04T01N01`  
  - Package name: `cat.itacademy.s04.t01.n01`  
- **PACKAGING:** Jar  
- **JAVA:** Minimum version 11  
- **Dependencies:**  
  - Spring Boot DevTools  
  - Spring Web  

---

### Import and Configuration

- Import the project into Eclipse using **File > Import > Existing Maven Project**.  
- In the `application.properties` file, configure the following variable:

  ```properties
  server.port=9000

---

### Creating the REST API

Based on the main package, create a subpackage called controller.

Inside it, add the class HelloWorldController with two methods:
String saluda(String nom)

  This method will receive a nom parameter as a RequestParam with the default value "UNKNOWN".

  It should respond to:

        http://localhost:9000/HelloWorld
        http://localhost:9000/HelloWorld?nom=MyName

  It will return the phrase:
    "Hola, " + nom + ". Estás ejecutando un proyecto Maven"

String saluda2(String nom)

  This method will receive the nom parameter as an optional PathVariable.

  It should respond to:

        http://localhost:9000/HelloWorld2
        http://localhost:9000/HelloWorld2/myname

  It will return the same phrase as the first method.

  ---

### Practicing Basic Maven Commands

Make sure Maven is installed and properly configured on your system. Open a terminal (either from your IDE or your system’s command line) and navigate to your project directory.

Key Maven commands to practice:

- Compile the project
    mvn compile

- Package the project
    mvn package

- Clean the project
    mvn clean

- Run the Spring Boot application
    mvn spring-boot:run


