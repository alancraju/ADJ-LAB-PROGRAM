CREATE DATABASE IF NOT EXISTS test;

USE test;

CREATE TABLE IF NOT EXISTS coffee (
    id INT PRIMARY KEY,
    coffee_name VARCHAR(100),
    price DECIMAL(10,2)
);

INSERT INTO coffee VALUES 
(1, 'Dark Roast', 90.00), 
(2, 'Doppio', 95.00), 
(3, 'Latte', 110.00);
