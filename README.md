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