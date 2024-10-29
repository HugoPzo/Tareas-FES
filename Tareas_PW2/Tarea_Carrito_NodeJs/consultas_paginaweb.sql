# CONSULTAS

USE pagina_web;

# Usuario -----------------
SHOW TABLES;
DESC roles;
DESC usuario;

# Pago --------------
DESC pago;

# Pedido ---------------
DESC pedido;
DESC pedido_videojuego;

# Videojuegos --------------
DESC videojuego;
DESC plataforma;
DESC videojuego_plataforma;


# PLATAFORMA
SELECT * FROM plataforma;

# ROLES
SELECT * FROM roles;

# USUARIOS
SELECT * FROM usuario;
SELECT * FROM usuario WHERE id_rol=2;