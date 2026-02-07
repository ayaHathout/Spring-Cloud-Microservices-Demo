# Spring-Microservices-Rest-Communication

A practical example demonstrating **REST-based** communication between Spring Boot microservices using **RestTemplate** and **Feign Client**.

---

## 📋 Overview
This project demonstrates two common approaches for synchronous HTTP communication between microservices in a Spring Boot ecosystem:

- RestTemplate - The traditional Spring approach for synchronous REST calls

- Feign Client - A declarative HTTP client that simplifies service-to-service communication

---

## 🏗️ Architecture
The project consists of two microservices:

1. Employee Service (employee_service)

    - Manages employee information

    - Exposes REST endpoints for employee CRUD operations

    - Port: 8081

2. Address Service (address-service)

    - Manages address information

    - Exposes REST endpoints for address CRUD operations

    - Port: 8082
 
---

## 🔧 Technologies Used
- Java 21

- Spring Boot 4.0.2

- Spring Web MVC

- Spring Data JPA

- Spring Cloud OpenFeign - For declarative REST clients

- Maven - For dependency management

- Model Mapper - For reducing boilerplate code

- MySQL - Database for Employee service

- PostgreSQL - Database for Address service

---

## 🚀 Getting Started
**Prerequisites**:
- Java 17 or higher

- Maven 3.6 or higher

- Your favorite IDE (IntelliJ IDEA, Eclipse, or VS Code)

  
