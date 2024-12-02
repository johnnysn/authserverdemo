# Spring Auth Server demo

This is a demo [Spring Authorization Server](https://docs.spring.io/spring-authorization-server/reference/overview.html)
app for integration with [NextAuth.js](https://next-auth.js.org/). This
application is supposed run alongside 
with 
[this NextAuth.js demo project](https://github.com/johnnysn/next-auth-demo).

## Prerequisites

Before you can run the application, 
make sure you have Java 21 (or later) installed.

## Running the application

To run the Spring Boot application, 
use the bootRun task provided by the Spring Boot Gradle plugin. 
Run the following command:

- On Unix/Linux/macOS:
    ```bash
        ./gradlew bootRun
    ```

- On Windows:
    ```bash
        gradlew.bat bootRun
    ```

This will start the application, 
and it will be accessible at http://localhost:9000 by default.