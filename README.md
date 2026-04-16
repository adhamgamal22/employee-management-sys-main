# Employee Management System

A RESTful API for managing employees, built with Java Spring Boot.

## 🛠️ Tech Stack

- Java Spring Boot
- Spring Data JPA
- Spring Security
- Maven

## 📁 Project Structure

```
src/
├── main/java/com/Adhoom/employee_management/
│   ├── abstracts/
│   ├── config/
│   ├── controllers/
│   ├── dtos/
│   ├── entities/
│   ├── repositpories/
│   ├── services/
│   ├── shared/
│   └── utils/
└── test/
```

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven

### Installation

```bash
git clone https://github.com/adhamgamal/employee-management-sys.git
cd employee-management-sys
mvn install
mvn spring-boot:run
```

### Configuration

Set up your database credentials in `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/employee_sys
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## 🔐 Authentication

This API uses Spring Security. Include a valid token in the request header:

```
Authorization: Bearer <your_token>
```

## 🧪 Testing

```bash
mvn test
```

The project includes both unit and integration tests.

## 📄 License

MIT
