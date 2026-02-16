![Status](https://img.shields.io/badge/Status-Active%20Learning%20Project-blue)
![Progress](https://img.shields.io/badge/Progress-Continuous-green)
![Learning](https://img.shields.io/badge/Learning%20Journey-In%20Progress-orange)

# Spring Cloud Microservices Demo

A comprehensive, step-by-step implementation of Spring Cloud microservices architecture. 
This project demonstrates real-world microservices patterns through practical, hands-on learning.

---

## 📊 Project Status & Learning Journey

### ✅ **Mastered & Implemented**
- **REST Communication Patterns**: RestTemplate vs OpenFeign Client
- **Service Discovery & Registration**: Eureka Server & Clients  
- **Multi-Database Architecture**: PostgreSQL & MySQL integration
- **Spring Boot Microservices**: Best practices and patterns

### 🔄 **Currently Implementing**
- API Gateway patterns with Spring Cloud Gateway
- Distributed configuration management
- Load balancing strategies

### 📚 **Learning Roadmap**
1. ✅ Basic RESTful microservices
2. ✅ Service-to-service communication  
3. ✅ Centralized service discovery (Eureka)
4. 🔄 API Gateway & Load Balancing
5. 📋 Distributed Configuration
6. 📋 Circuit Breaker (Resilience4j)
7. 📋 Distributed Tracing & Monitoring (Spring Cloud Sleuth & Zipkin)
8. 📋 Containerization (Docker & Kubernetes)

---

## 🏗️ Service Architecture

### 🔍 **Service Discovery Layer**
- **Eureka Server** (Port 8761) - Central registry for all services

### 🏢 **Business Services**
- **Employee Service** (Port 8081) - Manages employee data (MySQL)
- **Address Service** (Port 8082) - Handles address information (PostgreSQL)

### 🌉 **Gateway Layer** (In Progress)
- **API Gateway** - Single entry point, routing, and load balancing

---

## 🛠️ Tech Stack
- **Languages**: Java 21
- **Frameworks**: Spring Boot 4.x, Spring Cloud
- **Service Discovery**: Eureka
- **Communication**: OpenFeign, RestTemplate  
- **Databases**: PostgreSQL, MySQL, Spring Data JPA
- **Tools**: Maven, Lombok, ModelMapper

---

## 🎯 Purpose
This repository serves as both a learning resource and a reference implementation for Spring Cloud microservices patterns.
