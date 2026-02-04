🎓 Student Grade Management System

📌 Project Overview

The Student Management System is a full-stack web application designed to manage student records and academic performance efficiently.
It supports students, academic staff, and administrators, enabling secure authentication, grade management, analytics, and academic record tracking across multiple years.

The system follows modern software engineering practices, including Spring Boot, MyBatis Plus, React, and Test-Driven Development (TDD).

📑 Table of Contents

Technical Stack

Installation & Setup

Project Structure

Features

How to Use

🛠 Technical Stack
Backend

Java 17

Spring Boot 3.3.4

MyBatis Plus 3.5.7

H2 / MySQL Database

Spring Security + JWT

Maven 3.6+

JaCoCo (Code Coverage)

Frontend

React 18

Ant Design

Axios

jsPDF (PDF Generation)

⚙️ Installation & Setup
Prerequisites

Ensure the following are installed:

Java 17

Maven 3.6+

Node.js 18+

npm 9+

Git

🔧 Backend Setup

Clone the repository

git clone https://github.com/ucl-comp0010-2024/G-24java.git


Navigate to backend directory

cd StudentManagementSystemBackend


Install dependencies

mvn clean install


Run the application

Open StudentManagementSystemApplication.java

Run as Spring Boot Application

Backend runs on:

http://localhost:2800

🎨 Frontend Setup

Navigate to frontend directory

cd student-management-system-frontend


Install dependencies

npm install


Start frontend

npm start


Frontend runs on:

http://localhost:3000

🗂 Project Structure (Backend)
src/main/java
│
├── annotation        # Custom annotations
├── aspect            # AOP logic for annotations
├── config            # Configuration classes
├── controller        # REST controllers
├── dto               # Request DTOs
├── entity            # Database entities
├── enums             # Enum definitions
├── exception         # Custom exceptions
├── exceptionhandler  # Global exception handlers
├── generator         # Data initialization
├── mapper            # MyBatis mappers
├── model             # Domain models
├── response          # Standardized responses
├── service           # Business logic
├── utils             # Utility classes
├── vo                # Response objects

✨ Features
🔐 Server-Side Features

Authentication & Authorization

JWT-based authentication

Role-based access (Admin / Staff / Student)

Secure token refresh

Student Management

Add / Edit / Delete students

Bulk CSV import

Student performance analytics

Staff Management

Staff CRUD operations

CSV import support

Teaching performance statistics

Module Management

Manage academic modules

Module performance tracking

Assessment Records

Add / Update / Delete grades

Statistical analysis per record

Academic year tracking

Password Management

Secure password reset

Old-password verification

Test-Driven Development

Core services fully tested

JaCoCo coverage reporting

🌐 Web Features

Authentication UI

Login with role-based dashboards

Token auto-refresh

Admin Dashboard

System statistics

User management

Data import/export

Staff Portal

Grade entry & editing

Module analytics

Teaching performance insights

Student Portal

Academic record viewing

Performance statistics

Transcript download (PDF)

Data Handling

CSV import/export

PDF transcript generation

Real-time UI updates

Advanced filtering & search

▶️ How to Use
🔑 Default Admin Login
Username	Password
admin	123456

(Password can be changed after login)

🧑‍🏫 Add Academic Staff

Go to Academic Staff tab

Add manually or upload CSV

CSV template available in UI

🎓 Add Students

Accessible by Admin and Staff

Add manually or via CSV upload

Filter by programme, department, year

📚 Add Modules

Admin only

Define module leader, credits, MNC status

📝 Add Assessment Records

Add manually or upload CSV

Supports detailed performance analytics

📊 View & Search Data

Advanced filters for students, staff, modules

View detailed statistics and performance trends

Role-based data visibility

📄 Generate Transcript (PDF)

Admin & Staff: from Student view

Students: from Academic Records

Includes:

Personal info

Module results

Performance summary

🔐 Password Reset

Available to all roles

Requires old password verification

🚪 Logout

Use profile menu (top-right)

Secure session termination

🚀 Final Notes

This project demonstrates:

Clean architecture

Secure authentication

Scalable backend design

Real-world academic data workflows
