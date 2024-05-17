# Spring Auth with JWT
This project is a sample application demonstrating how to implement authentication and authorization using Spring Security and JSON Web Tokens (JWT) in a Spring Boot application.

# Prerequisites
Before getting started, make sure you have the following installed in your development environment:

* Java JDK 11
* Maven
* Docker

# Technologies Used
* Spring Boot: For creating the web application.
* Spring Security: For managing application security.
* JWT (JSON Web Tokens): For token-based authentication.
* Spring Data JPA: For interacting with the database.
* Docker Compose: For containerized deployment.

# Installation and Execution
1. Clone the repository:
```bash
git clone https://github.com/your-user/spring-auth-jwt.git
```
Or download and extract the project manually.

2. Navigate to the project directory:
```bash
cd spring-auth-jwt
```
3. Generate artifact
```bash
mvn clean install -DskipTests
```
4. Run the project using docker-compose:
```bash
docker-compose up --build
```
5. To stop all containers and remove volumes created:
```bash
docker-compose down --volumes
```
The application will start and be accessible at http://localhost:8080.

# Endpoints
The application provides the following endpoints:

* GET /api/users: Returns all registered users.
* POST /api/user/save: Creates a new user.
* POST /api/role/save: Creates a new role.
* POST /api/role/addtouser: Adds a role to a user.
* DELETE /api/user/delete/{id}: Deletes a user by their ID.
* GET /api/token/refresh: Refreshes the access token (refresh token)

# Configuration
The application's settings can be found in the application.properties file. Make sure to configure the properties related to Redis and the database according to your environment.
```yml
spring:
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    database: postgresql
    database-platform: org.hibernate.dialect.PostgreSQLDialect
    open-in-view: false
    generate-ddl: true

  datasource:
    driver-class-name: org.postgresql.Driver
    url: ${POSTGRES_URL:jdbc:postgresql://localhost:5432/authentication}
    username: ${POSTGRES_USERNAME:root}
    password: ${POSTGRES_PASSWORD:example}
    driverClassName: org.postgresql.Driver
```

# Contributing
If you wish to contribute to this project, follow these steps:

1. Fork the project.
2. Create a branch for your feature: git checkout -b feature-new-feature.
3. Make your changes and commit them: git commit -m 'Add a new feature'.
4. Push to the branch: git push origin feature-new-feature.
5. Submit a pull request.
