# Student Management REST API

A RESTful backend application built using Spring Boot, Spring Data JPA, Hibernate, and PostgreSQL for managing student records.

## Features

* Create students
* View all students
* Update student details
* Delete students
* PostgreSQL database integration
* Duplicate email validation

## Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven

## API Endpoints

| Method | Endpoint               | Description      |
| ------ | ---------------------- | ---------------- |
| GET    | `/api/v1/student`      | Get all students |
| POST   | `/api/v1/student`      | Create a student |
| PUT    | `/api/v1/student/{id}` | Update a student |
| DELETE | `/api/v1/student/{id}` | Delete a student |

## Run Locally

```bash
git clone <repo-url>
cd student-management-rest-api
mvn spring-boot:run
```


