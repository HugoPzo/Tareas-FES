import inicio from "./routes/inicio_router.js";

// CONFIGURACIONES PAGINA

// import = requires

import express from "express";

// Crear la aplicacion 
const app = express();

// Accesos a los datos del formulario
// Traer datos del formulario
app.use(express.urlencoded({extended:true}))

// Renderizar las paginas
// pug -> estilo
app.set("view engine", "pug");
app.set("views", "./views");

// carpeta publica (Acceso de Usuario)
app.use(express.static("public"));

// routing -> Ruta por default
app.use("/", inicio)

// definiendo el puerto -> Puerto de comunicion
// Se le puede dar >=1024
const port = 2800;
app.listen(port, () => {
    console.log("Esperando peticiones en");
});