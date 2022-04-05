# Spring Boot + Tomcat + Docker

## Local

```shell
./gradlew bootRun
```

## How to test

  ```shell
  curl -D- "http://localhost:8080/hello?name=Spring%20Boot"
  ```

  * _**Vulnerable endpoint**_

    ```shell
    curl -D- "http://localhost:8080/vulnerable" --form "name=Spring Boot"
    ```

## Docker

  - Build & run

    ```shell
    ./gradlew clean build
    docker-compose up -d
    ```

      - Re-build after code changed
    
        ```shell
        ./gradlew clean build
        docker-compose up -d --build
        ```
    
      - Clean up

        ```shell
        docker-compose down
        ```

  - Run w/ pre-build image

    ```shell
    docker run -p 8080:8080 --name mvc-app phongnt/spring-boot-war-tomcat
    ```

    - Clean up

      ```shell
      docker rm -f mvc-app
      ```
