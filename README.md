# Secret Swoop API

![Logo](./logo.png)

## Overview
Welcome to the SecretSwoop API, the backbone of the SecretSwoop secret Santa service. Built with Kotlin for its concise syntax and interoperability with Java, and leveraging the robustness of Spring Boot, this API is designed to be scalable, efficient, and easy to use.

## Features
- **Secure User Authentication**: Ensuring secure access to user accounts.
- **Gift Matching Algorithms**: Sophisticated logic to anonymously match participants.
- **Wishlist Management**: API endpoints to create, read, update, and delete wishlists.
- **Notification System**: Automated alerts for important events within the Secret Santa cycle.

## Technology Stack
- **Language**: Kotlin
- **Framework**: Spring Boot
- **Database**: Postgres
- **Testing**: JUnit, Spring Boot Test

## Getting Started
To get the API up and running on your local machine, follow these steps:

1. Clone the repository:
    ```shell
    git clone https://github.com/secretswoop/secretswoop-api.git
    ```
2. Navigate to the project directory:
    ```shell
    cd secretswoop-api
    ```
3. Build the project with Gradle:
    ```shell
    ./gradlew build
    ```
4. Run the application:
    ```shell
    ./gradlew bootRun
    ```

The API will be available at `http://localhost:8080`.

## Documentation
For full API documentation, please refer to:
* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.0/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.0/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.0/reference/htmlsingle/index.html#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.0/reference/htmlsingle/index.html#using.devtools)

## Contribution
We welcome contributions! Please read our [Contribution Guidelines](CONTRIBUTING.md) before submitting a pull request.

## License
SecretSwoop API is open-sourced under the [MIT License](LICENSE).

## Contact
For any queries or feedback, please contact [Contact Information].

Thank you for being part of the SecretSwoop journey!
