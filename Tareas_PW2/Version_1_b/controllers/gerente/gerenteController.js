import {Gerente} from "../../models/gerente.js";
import Hotel from "../../models/hotel.js";

// Creamos la funcion
// Async -> Se espera a que se proporcione la informacion deseada (funcion), no avanza si no los proporciona.
const accionMostrarGerente = async(req, res) => {
    const gerentes = await Gerente.findAll({
        include: {
            model: Hotel
        },
        raw:true,
        nest:true
    });

    res.render("gerente/consultaGerente", {
        pagina: "Lista de Gerentes",
        gerente: gerentes
    });
};

// Exportamos la Funcion
export {accionMostrarGerente};