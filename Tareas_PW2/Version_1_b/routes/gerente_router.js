// Importamos Express
import express from "express";
import {accionMostrarGerente} from "../controllers/gerente/gerenteController.js";


const router_Gerente = express.Router();


// Consulta de Gerentes -> Ruta de Gerentes
router_Gerente.get("/mostrarGerentes", accionMostrarGerente);

export default router_Gerente;