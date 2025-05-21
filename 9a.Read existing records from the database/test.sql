CREATE DATABASE test;

USE test;

CREATE TABLE coffee (
    id INT PRIMARY KEY,
    coffee_name VARCHAR(100),
    price DECIMAL(10,2)
);

INSERT INTO coffee VALUES (1, 'Espresso', 80.00), (2, 'Latte', 100.00), (3, 'Cappuccino', 120.00);
