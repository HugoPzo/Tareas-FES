SET NAMES 'UTF8MB4';
DROP DATABASE IF EXISTS pagina_web;
CREATE DATABASE IF NOT EXISTS pagina_web DEFAULT CHARACTER SET UTF8MB4;
USE pagina_web;


CREATE TABLE roles(
    id_rol      INT NOT NULL AUTO_INCREMENT,
    tipo        VARCHAR(30),
    PRIMARY KEY(id_rol),
);

CREATE TABLE usuario(
    id_usuario      INT NOT NULL AUTO_INCREMENT,
    nombre          varchar(50) NOT NULL,
    ap_materno      varchar(50) NOT NULL,
    ap_paterno      varchar(50) NOT NULL,
    correo          varchar(50) NOT NULL,
    telefono        varchar(50) NOT NULL,
    username        varchar(50) NOT NULL,

    PRIMARY KEY(id_usuario),
    FOREIGN KEY(id_rol) REFERENCES roles(id_rol)
);

CREATE TABLE pago(
    id_pago                 INT NOT NULL AUTO_INCREMENT,
    nombre_en_tarjeta       varchar(30),
    numero_en_tarjeta       INT(16),
    vencimiento             DATETIME

    PRIMARY KEY(id_pago),
    FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario)
)


CREATE TABLE pedido (
    id_pedido   INT NOT NULL AUTO_INCREMENT,
    fecha       DATE,
    total       INT,

    PRIMARY KEY(id_pedido),
    FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY(id_pago), REFERENCES pago(id_pago)
);



CREATE TABLE plataforma(
    id_plataforma   INT NOT NULL AUTO_INCREMENT,
    nombre          varchar(20)
);

CREATE TABLE videojuego(
    id_videojuego   INT NOT NULL AUTO_INCREMENT,
    titulo          varchar(50) NOT NULL,
    imagen          varchar(255) NOT NULL,
    trailer         varchar(255) NOT NULL,
    
    PRIMARY KEY(id_videojuego)
);

CREATE TABLE videojuego_plataforma(
    stock       INT,
    costo       INT,
    precio      INT,
    FOREIGN KEY(id_plataforma) REFERENCES plataforma(id_plataforma),
    FOREIGN KEY(id_videojuego) REFERENCES videojuego(id_videojuego)
)

CREATE TABLE pedido_videojuego(
    cantidad        INT(10),
    FOREIGN KEY(id_pedido) REFERENCES pedido(id_pedido),
    FOREIGN KEY(id_videojuego) REFERENCES videojuego(id_videojuego)
    
)
