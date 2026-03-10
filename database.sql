CREATE DATABASE book_management;

USE book_management;

CREATE TABLE books(
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(100),
author VARCHAR(100),
price DOUBLE,
quantity INT
);