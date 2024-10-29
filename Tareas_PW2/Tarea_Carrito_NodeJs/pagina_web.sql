SET NAMES 'UTF8MB4';
DROP DATABASE IF EXISTS pagina_web;
CREATE DATABASE IF NOT EXISTS pagina_web DEFAULT CHARACTER SET UTF8MB4;
USE pagina_web;


CREATE TABLE roles(
    id_rol      INT NOT NULL AUTO_INCREMENT,
    tipo        VARCHAR(30),
    PRIMARY KEY(id_rol)
);

CREATE TABLE usuario(
    id_usuario      INT NOT NULL AUTO_INCREMENT,
    nombre          varchar(50) NOT NULL,
    ap_materno      varchar(50) NOT NULL,
    ap_paterno      varchar(50) NOT NULL,
    correo          varchar(50) NOT NULL,
    telefono        varchar(50) NOT NULL,
    username        varchar(50) NOT NULL,
    id_rol			INT NOT NULL,	

    PRIMARY KEY(id_usuario),
    FOREIGN KEY(id_rol) REFERENCES roles(id_rol)
);

CREATE TABLE pago(
    id_pago                 INT NOT NULL AUTO_INCREMENT,
    nombre_en_tarjeta       varchar(30),
    numero_en_tarjeta       INT(16),
    vencimiento             DATETIME,
    id_usuario				INT,

    PRIMARY KEY(id_pago),
    FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario)
);


CREATE TABLE pedido (
    id_pedido   INT NOT NULL AUTO_INCREMENT,
    fecha       DATE,
    total       INT,
    id_usuario	INT,
    id_pago		INT,	

    PRIMARY KEY(id_pedido),
    FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY(id_pago) REFERENCES pago(id_pago)
);



CREATE TABLE plataforma(
    id_plataforma   INT NOT NULL AUTO_INCREMENT,
    nombre          varchar(20),
    PRIMARY KEY(id_plataforma)
);


CREATE TABLE videojuego(
    id_videojuego   INT NOT NULL AUTO_INCREMENT,
    titulo          varchar(50) NOT NULL,
    imagen          varchar(255) NOT NULL,
    trailer         varchar(255) NOT NULL,
    costo       	INT,
    precio      	INT,
	
    PRIMARY KEY(id_videojuego)
);

CREATE TABLE videojuego_plataforma(
    id_plataforma	INT,
    id_videojuego	INT,
    stock       	INT,
    
    FOREIGN KEY(id_plataforma) REFERENCES plataforma(id_plataforma),
    FOREIGN KEY(id_videojuego) REFERENCES videojuego(id_videojuego)
);

CREATE TABLE pedido_videojuego(
	id_pedido		INT,
    id_videojuego	INT,
    cantidad        INT(10),
    FOREIGN KEY(id_pedido) REFERENCES pedido(id_pedido),
    FOREIGN KEY(id_videojuego) REFERENCES videojuego(id_videojuego)
);


# Insertando Datos

# Roles
INSERT INTO roles(tipo) VALUES
("Administrador"),
("Usuario");

# Plataforma 
INSERT INTO plataforma(nombre) VALUES
("Xbox"),
("PlayStation"),
("Nintendo");

# USUARIO
INSERT INTO usuario (nombre, ap_materno, ap_paterno, correo, telefono, username, id_rol) VALUES
('Juan', 'Pérez', 'García', 'juan.perez@gmail.com', '5551234567', 'juanp', 1),
('María', 'López', 'Hernández', 'maria.lopez@yahoo.com', '5552345678', 'mlopez', 1),
('Carlos', 'Sánchez', 'Martínez', 'carlos.sanchez@hotmail.com', '5553456789', 'carloss', 1),
('Ana', 'Gómez', 'Jiménez', 'ana.gomez@outlook.com', '5554567890', 'anag', 1),
('Luis', 'Ramírez', 'Flores', 'luis.ramirez@gmail.com', '5555678901', 'luisrf', 1),
('Elena', 'Torres', 'Reyes', 'elena.torres@yahoo.com', '5556789012', 'elenat', 1),
('Javier', 'Morales', 'Cruz', 'javier.morales@hotmail.com', '5557890123', 'javierm', 1),
('Sofía', 'Vásquez', 'Salinas', 'sofia.vasquez@outlook.com', '5558901234', 'sofiav', 2);




