# Documentacion Paginas Web 2

## Chec
`node -v`

i = install


Matar Terminal --

    - Fotos Cel
    **sudo lsof -i -> Todos las terminales corriendo
    **sudo lsof -i :puerto -> Busqueda de puerto por nombreDePuerto
    kill -9 PID


NODEJS

- Dentro de un directorio, iniciamos...
(terminal)

npm init
npm i express - (No tocar: package-lock.json, node_modules)
npm i -D nodemon

--- Html -> Pug
Usar Pug
npm i pug

-- Carpetas Proyecto
- config
- controllers
- public
- routes
- views

- Punto de Entrada 
"main": index.js -> (Crear archivo 'index.js')

Cambiar/Agregar ->  "type": "module", en package.json para usar 'import'


- Correr Servido / Pagina
-> Editar 'scripts' dentro de package.json
npm run server



-----
Abrir servidor dentro de browser.
localhost:2800 ****


-- Tarea, meter tarea Goku
Nuevo Proyecto




npm i

ctrl+c -> Matar Puerto


Correr una sola terminal



Clase 2 ---------

-- view terminal - key shortcut


Estudiar Bootstrap (Componentes disponibles en Bootstrap)
 - Copiar css bootstrap
 - Copiar javascript bootstrap


 Base de Datos
    Instalacion -- 

    *sudo mysql 
    -> Esta opcion es incorrecta

    *sudo mysql -u root -p 
    -> Configurar MariaDB -> Correcta Conexion
    
    *source esquema.sql;
    *use nombre_tabla ... Comandos

    (DESC nombre_tabla;) -> Estructura para mostrar la tabla -> Terminar con (;)


    *npm i sequelize mariadb 
    -> Dos comandos instalados en un comando


    - Como trabaja la informacion? Base de Datos
        Tabla a Objeto - Hacer Tablas a traves de Objetos (Mapeo)
            ORM - > Object Relational Map (Estudiar)

            Pool - > Conexiones - no Peticiones


    - models -> Nueva Carpeta
        Relacion de Base de Datos - Indicar mapeo de todas las tablas
        Como se debe comunicar con las tablas --

    + Privilegios de Root Mysql +

    Permiso de Root *
        sudo mysql -u root -p
        GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost' IDENTIDIED BY '1234';
        FLUSH PRIVILEGES;

Ctrl+C -> Salir de DB 
Ctrl+D -> Salir de MariaDb


Relaciones SQL ->

    LLaves Principales - Origen (PK)
    Llaves Secundarias - Destino (FK)

    Relacion 1 a 1:
        En alguna de las dos debe estar la foreign key
    
    Relacion 1 a muchos:
        La foreign key debe estar en la tabla de mayor cardinalidad 
    
    Relacion Muchos a Muchos
        La foreign key se debe estar en una tabla intermedia


    Lo mejor es que el la tabla prioritaria tenga la PK, la segunda tabla (puede tener una PK), pero lo mas 
    recomendable es que la segunda tabla tenga solo la FK de la primera tabla, para evitar errores !IMPORTANTE



Tarea: 
    10 - Oct:
        Insertar Consulta de Gerentes
        Insertar Consulta de Habitaciones