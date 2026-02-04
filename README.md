# 🎓 Student Management System

A full-stack **Student Management System** built to manage academic records, performance analytics, and user roles efficiently.  
Designed with modern software engineering principles, secure authentication, and scalable architecture.

---

## 📌 Project Overview

The **Student Management System** is a role-based web application that supports:

- 🎓 Students
- 🧑‍🏫 Academic Staff
- 🛠 Administrators  

It enables secure authentication, grade management, performance analytics, and academic record tracking across multiple academic years.

The system follows **industry-standard practices**, including:

- Spring Boot backend
- MyBatis Plus ORM
- React frontend
- JWT-based security
- Test-Driven Development (TDD)

---

## 📑 Table of Contents

- [Technical Stack](#-technical-stack)
- [Installation & Setup](#-installation--setup)
- [Project Structure](#-project-structure-backend)
- [Features](#-features)
- [How to Use](#-how-to-use)
- [Final Notes](#-final-notes)

---

## 🛠 Technical Stack

### 🔧 Backend
- Java 17  
- Spring Boot 3.3.4  
- MyBatis Plus 3.5.7  
- H2 / MySQL  
- Spring Security + JWT  
- Maven 3.6+  
- JaCoCo (code coverage)

### 🎨 Frontend
- React 18  
- Ant Design  
- Axios  
- jsPDF (PDF generation)

---

## ⚙️ Installation & Setup

### ✅ Prerequisites

Ensure the following are installed:

- Java 17  
- Maven 3.6+  
- Node.js 18+  
- npm 9+  
- Git  

---

### 🔧 Backend Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/SAIDEEPIKA-SURESH/Student-management-system/edit/main/README.md 
Navigate to backend directory

cd StudentManagementSystemBackend
Install dependencies

mvn clean install
Run the application

Open StudentManagementSystemApplication.java

Run as Spring Boot Application

📍 Backend runs on:

http://localhost:2800
🎨 Frontend Setup
Navigate to frontend directory

cd student-management-system-frontend
Install dependencies

npm install
Start the application

npm start
📍 Frontend runs on:

http://localhost:3000
🗂 Project Structure (Backend)
src/main/java
│
├── annotation        # Custom annotations
├── aspect            # AOP logic
├── config            # Configuration classes
├── controller        # REST controllers
├── dto               # Request DTOs
├── entity            # Database entities
├── enums             # Enum definitions
├── exception         # Custom exceptions
├── exceptionhandler  # Global exception handling
├── generator         # Data initialization
├── mapper            # MyBatis mappers
├── model             # Domain models
├── response          # Standardized API responses
├── service           # Business logic
├── utils             # Utility classes
├── vo                # Response objects
✨ Features
🔐 Server-Side Features
Authentication & Authorization
JWT-based authentication

Role-based access control (Admin / Staff / Student)

Secure token refresh

Student Management
Add / Edit / Delete students

Bulk CSV import

Performance analytics

Staff Management
Staff CRUD operations

CSV import support

Teaching performance statistics

Module Management
Academic module administration

Module performance tracking

Assessment Records
Add / Update / Delete grades

Statistical analysis per module

Academic year tracking

Password Management
Secure password reset

Old-password verification

Test-Driven Development
Core services fully tested

JaCoCo coverage reporting

🌐 Web Features
Role-based login dashboards

Auto token refresh

Admin analytics dashboard

CSV import/export

Advanced filtering & search

Real-time UI updates

PDF transcript generation

▶️ How to Use
🔑 Default Admin Login
Username	Password
admin	123456
Password can be changed after login.

🧑‍🏫 Add Academic Staff
Navigate to Academic Staff

Add manually or upload CSV

CSV templates provided in UI

🎓 Add Students
Accessible by Admin and Staff

Manual or CSV upload

Filter by department, programme, and year

📚 Add Modules
Admin only

Define module leader, credits, and MNC status

📝 Add Assessment Records
Manual or CSV upload

Automatic performance analytics

📊 View & Search Data
Advanced filters

Role-based data visibility

Performance trend analysis

📄 Generate Transcript (PDF)
Admin & Staff: via Student view

Students: via Academic Records

Includes:

Personal details

Module results

Performance summary

🔐 Password Reset
Available for all roles

Requires old password verification

🚪 Logout
Use profile menu (top-right)

Secure session termination

