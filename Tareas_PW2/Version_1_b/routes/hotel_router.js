// Importamos Express
import express from "express";
import {accionMostrarHotel} from "../controllers/hotel/hotelController.js";


const router_Hotel = express.Router();


// Consulta de Hoteles -> Ruta de Hoteles
router_Hotel.get("/mostrarHotel", accionMostrarHotel);

router_Hotel.get("")

export default router_Hotel;