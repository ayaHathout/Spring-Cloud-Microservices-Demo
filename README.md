![Status](https://img.shields.io/badge/Status-Active%20Learning%20Project-blue)
![Progress](https://img.shields.io/badge/Progress-Continuous-green)
![Learning](https://img.shields.io/badge/Learning%20Journey-In%20Progress-orange)

# Spring Cloud Microservices Demo

A comprehensive, step-by-step implementation of Spring Cloud microservices architecture. 
This project demonstrates real-world microservices patterns through practical, hands-on learning.

---

## 📊 Project Status & Learning Journey

### ✅ **Mastered & Implemented**
- **RESTful Microservices Design**: Built independent REST-based services with clear separation of responsibilities
- **Synchronous Communication Strategies**: Implemented and compared RestTemplate, WebClient, and OpenFeign
- **Strategy Pattern for Communication Layer**: Designed a pluggable AddressServiceClient abstraction with multiple runtime implementations
- **Profile-Based Runtime Switching**: Used Spring Profiles (rest-template, open-feign, rest-template-discovery-client) to dynamically select communication strategy
- **Service Discovery & Registration**: Eureka Server & dynamic client registration
- **Client-Side Load Balancing**: Spring Cloud LoadBalancer with multiple Address Service instances
- **DiscoveryClient Metadata Usage**: Resolved service context path dynamically from Eureka metadata
- **Centralized Configuration**: Spring Cloud Config Server with Git-based externalized configuration
- **Configuration Lifecycle & Refresh Scope**: Explored config loading order, runtime refresh behavior, and bean recreation
- **Multi-Database Architecture**: MySQL (Employee Service) & PostgreSQL (Address Service) integration

### 🔄 **Currently Implementing**
- API Gateway patterns with Spring Cloud Gateway
- Rate Limiting strategies
- Advanced routing & request filtering

### 📚 **Learning Roadmap**
1. ✅ RESTful Microservices
2. ✅ Synchronous Communication (Rest Clients like Rest Template, Web Client, Open Feign)
3. ✅ Service Discovery & Registeration (Eureka)
4. ✅ Load Balancing (Spring Cloud Load Balancer)
5. ✅ Centralized Configuration (Config Server)
6. ✅ API Gateway & Rate Limiting
7. 🔄 Fault Tolerance using Resilience4j (Retry ✅, Circuit Breaker ✅, Rate Limiter, Time Limiter, Cache, Bulkhead)
8. 📋 Distributed Tracing & Monitoring (Micrometer Tracing + Zipkin)
9. ✅ Centralized Logging using ELK stack
10. 📋 Security Between Services (OAuth2, JWT, Keycloak)
11. 📋 Asynchronous Communication (RabbitMQ ✅, Kafka)
12. 📋 Saga Pattern
13. 📋 Containerization (Docker)
14. 📋 Orchestration (Kubernetes)

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
