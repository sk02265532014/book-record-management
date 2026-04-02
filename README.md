# 📚 Book Management System (Java + MySQL)

## 🔹 Overview
The Book Management System is a console-based application developed using **Java and MySQL** that allows users to perform basic CRUD (Create, Read, Update, Delete) operations on book records.

This project demonstrates the use of **JDBC (Java Database Connectivity)** for interacting with a relational database and follows a structured approach by separating concerns into different layers.

---

## 🔹 Features
- ➕ Add a new book  
- 📖 View all books  
- ✏️ Update book details (price & quantity)  
- ❌ Delete a book  
- 📂 Menu-driven console interface  

---

## 🔹 Tech Stack
- **Language:** Java  
- **Database:** MySQL  
- **Concepts Used:** JDBC, OOP, CRUD Operations  

---

## 🔹 Project Structure

- **src/**
  - **model/** → Book.java
  - **dao/** → BookDAO.java
  - **util/** → DBConnection.java
  - **ui/** → Menu.java
  - Main.java  
- **database/** → schema.sql  
- README.md


---

## 🔹 Database Setup
Run the following SQL queries:

```sql
CREATE DATABASE book_management;

USE book_management;

CREATE TABLE books (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    author VARCHAR(100),
    price DOUBLE,
    quantity INT
);
