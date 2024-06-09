# Registration Form

## Overview

This project is a registration form built using Spring framework with JSP for the frontend and MySQL for the database. It includes validations for the name, email, and password fields to ensure data integrity and security.Also allow only new user to register if old user try to register it gives warning .

## Features

- **User Registration**: Collects user information including name, email, and password.
- **Form Validation**: Validates input to ensure data integrity and prevent errors.
- **Spring Framework**: Utilizes Spring for backend services and database connectivity.
- **JSP for Frontend**: Renders the registration form using JSP pages.
- **MySQL Database**: Stores user registration data securely.

## Technologies Used

- **Spring Framework**: For creating backend services and managing dependencies.
- **JSP (JavaServer Pages)**: For rendering dynamic views and handling user input.
- **MySQL**: As the relational database management system.
- **HTML/CSS**: For form layout and basic styling.
- **Java**: For backend logic and controller management.

## How to Run

1. **Clone the repository**:
    ```bash
    git clone https://github.com/01prashu/registration-form.git
    ```

2. **Navigate to the project directory**:
    ```bash
    cd registration-form
    ```

3. **Access the Registration Form**:
    Open your web browser and go to `http://localhost:8080/open`

## Project Structure

registration-form
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── spring
│   │   │       ├── controller
│   │   │       │   └── RegisterController.java
│   │   │       ├── dao
│   │   │       │   ├── SpringConfig.java
│   │   │       │   ├── ImplementInterfaceDao.java
│   │   │       │   └── InterfaceDao.java
│   │   │       └── model
│   │   │           └── Student.java
│   │   ├── resources
│   │   │   └── application.properties
│   │   └── webapp
│   │       ├── WEB-INF
│   │       │   ├── views
│   │       │   │   ├── open.jsp
│   │       │   │   └── success.jsp
│   │       │   └── web.xml  <-- Your new web.xml file
│   └── pom.xml
└── README.md
























































