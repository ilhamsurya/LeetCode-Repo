## Spring
Initialization Spring
```bash
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-web</artifactId>
    <version>5.3.5</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.3.5</version>
</dependency>
```
Initialization Spring Boot
```bash
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <version>2.4.4</version>
</dependency>
```

## MySQL
[installation](https://hevodata.com/learn/spring-boot-mysql-integration/#Step2)
```bash
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>
```

## OAuth2
```bash
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-oauth2-client</artifactId>
    <version>2.3.3.RELEASE</version>
</dependency>
```
Setup key (Application.properties)
```bash
spring.security.oauth2.client.registration.google.client-id=<your client id>
spring.security.oauth2.client.registration.google.client-secret=<your client secret>

spring.security.oauth2.client.registration.facebook.client-id=<your client id> 
spring.security.oauth2.client.registration.facebook.client-secret=<your client secret>
```
