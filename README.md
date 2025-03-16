# Secure Token API

This is a backend application built with Spring Boot and Spring Security. It implements user authentication and authorization using JWT (JSON Web Tokens).

## Features

- User authentication with JWT.
- Role-based access control.
- Stateless session management.
- Integration with PostgreSQL for data persistence.

## Prerequisites

- Java 21
- Maven
- PostgreSQL

## Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/berkesayin/secure-token-api.git
   cd secure-token-api
   ```

2. Configure the database:

   - Update your PostgreSQL connection details in `application.yml`.

3. Build the project:

   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

### Authentication

- `POST /api/auth/sign in` - Authenticate a user and receive a JWT.
- `POST /api/auth/sign up` - Register a new user.

### Protected Endpoints

- `GET /api/v1/test/all` - Accessible without authentication.
- Other endpoints require authentication and proper authorization.

## Dependencies

Key dependencies used in this project:

- Spring Boot Starter Security
- Spring Boot Starter Data JPA
- JWT (io.jsonwebtoken)
- PostgreSQL Driver
- Lombok
