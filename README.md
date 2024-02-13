# Client API

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/kaiqlopes/client-crud/blob/main/LICENSE)

# About the project
This project is a Back-End RESTful API that you can register, retrieve, update and also delete the customers data.
<br><br>
Very useful when you need to keep records of your clients.

## Domain Model

![image](https://github.com/kaiqlopes/client-crud/assets/58572272/f727e744-8a57-49e0-b729-6d85e0a3e587)



## Used technologies

- Java 21
- Spring Boot
- JPA: Hibernate
- H2 Database
- Jakarta Bean Validation
- Maven

## Skills

- Implemented using layered architecture <br>
  ![image](https://github.com/kaiqlopes/client-crud/assets/58572272/1d229883-d1e3-4593-9b19-26887cf8cc18)
  <br><br>
- Customized HTTP response codes using ResponseEntity
- Customized exceptions response messages

## How to run

<b>Prerequisites:</b> Java 17

<b>1.</b> Clone the repository
  ```bash
  git clone git@github.com:kaiqlopes/client-api.git
```
<br>

<b>2.</b> Open the project in your preferred IDE and execute it

<br>

<b>3.</b> Use your favorite API REST testing tool

## Endpoints:

<br>

- <b>GET CLIENT BY ID:</b>
```bash
  localhost:8080/clients/idHere
```
<br>

- <b>GET CLIENT BY NAME (Case insensitive):</b>
```bash
  localhost:8080/clients?name=nameHere
```
<br>

- <b>GET ALL CLIENTS:</b>
```bash
  localhost:8080/clients
```

<br>

- <b>POST NEW CLIENT:</b> <br>
```bash
  localhost:8080/clients
```

<br>

- <b>PUT CLIENT (UPDATE):</b> <br>
```bash
  localhost:8080/clients/idHere
```

<br>

- <b>DELETE CLIENT:</b> <br>
```bash
  localhost:8080/clients/idHere
```

## Author
<b>_Kaique Lopes da Silva_</b> <br>
<div align="left" style="display: inline-block;">
  <a href="https://www.linkedin.com/in/kaiqlopes/" target="_blank">
    <img align= "center" alt="Kaiq-linkedin" = height "110" width="110" src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">
  </a>
</div>
