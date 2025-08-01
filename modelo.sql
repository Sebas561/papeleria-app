-- Base de datos para la papelería
CREATE DATABASE papeleria;

USE papeleria;

-- Tabla de productos
CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10,2) NOT NULL,
    existencia INT NOT NULL,
    categoria VARCHAR(50)
);
