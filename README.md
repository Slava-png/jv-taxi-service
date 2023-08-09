# 🚕 Taxi-Service 🚕
### Project description:
```
A simple web-application that supports authentication, registration and other CRUD operations.
```
# 🚀 Features
- Authentication like a driver
- create/update/remove a car;
- create/update/remove a driver;
- create/update/remove a manufacturer;
- display list of all cars;
- display list of all drivers;
- display list of all manufacturers;
- display  cars of the current driver;
## 📂Structure
#### Project has N-Tier Architecture:
* `controller`: Contains servlets that handle HTTP requests and responses;
* `dao`: Contains data access objects for database operations;
* `exception`: Contains custom exception classes;
* `lib`: Contains dependency injectors;
* `model`: Contains domain models (entities);
* `service`: Contains business logic and services;
* `util`: Contains utility class used for managing database connections;
* `webfilter`: Contains the class used to authenticate user requests.
* `resources`: Contains the script used to initialize the database schema
* `webapp`: JSP files, CSS files, and the web.xml deployment descriptor;
## 🔧 Endpoints
* `/cars` 
  * `/drivers`
    * `/add` - add driver to a car
  * `/add` - add a car
  * `/all` - show all cars
* `/drivers`
  * `/add` - add a driver
  * `/all` - show all drivers
* `/manufacturers` 
  * `/add` - add a manufacturer
  * `/all` - show all manufacturers
* `/index` - main page
* `/login` - redirects to 'add a driver' page
* `/logout` - logout page
## ⚙️ Used technologies and libraries:
- Java (JDK 11)
- Apache Maven
- Apache Tomcat
- MySQL
- JDBC
- Javax Servlet
- JSP and JSTL
- HTML/CSS
- Checkstyle plugin
- log4j2
## 🔨 Steps how to run:
### Required tools:
- Java
- Maven
- Apache Tomcat
- MySQL database
### Steps to follow:
- Run script from the `resources/init_db.sql` file to set up DB
- Specify your database connection parameters in the `src/main/java/taxi/util/ConnectionUtil.java`.
- Set up Tomcat 
- Run the app 
- Go to the http://localhost:8080

### Docker image of application:

- Start Docker Engine
- Pull image from Docker Hub ``
- Run `docker-compose up`
- 







