// Importamos Pagina
import inicio from "./routes/inicio_router.js";
import express from "express";

// Iniciamos servidor
const app = express();

// Usamos un servidor codificado
app.use(express.urlencoded({extended:true}))

// Establecemos sus configuraciones
app.set("view engine", "pug");
app.set("views", "./views");

// Establecemos como publico  
app.use(express.static("public"));

// Usamos 'inicio' 
app.use("/", inicio)

// Iniciamos el puerto
const port = 2800;
app.listen(port, () => {
    console.log("Iniciando Puerto");
})

