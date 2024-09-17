const shopContent = document.getElementById("shopContent");
const mostrarCarrito = document.getElementById("carrito_Compra");
const modalContainer = document.getElementById("modal-container");

let carrito = [];

// Nos representa cada uno de los productos
productos.forEach((product)=> {
    // Crear HTML
    let content = document.createElement("div");
    // Dar clase al elemento creado
    content.className = "card"
    // Se puede añadir una clase/id para dar estilo
    content.innerHTML = `
    <img class="imagenes_ropa" src="${product.img}">
    <h3>${product.nombre}</h3>
    <p>${product.descripcion}</p>
    <p>$ ${product.precio}</p>
    `;

    // Añadir al punto HTML deseado
    shopContent.append(content);

    let comprar = document.createElement("button");
    comprar.className = "boton_comprar"
    comprar.innerText = "Comprar";

    content.append(comprar)

    comprar.addEventListener("click", () => {
        carrito.push({
            id: product.id,
            img: product.img,
            nombre: product.nombre,
            precio: product.precio,
        })
        console.log(carrito);
        
    })

})

mostrarCarrito.addEventListener("click", () => {

    // Limpiar Carrito
    modalContainer.innerHTML = ``;

    modalContainer.style.display = "flex";
    
    const modalHeader = document.createElement("div");
    modalHeader.className = "modal-header";
    modalHeader.innerHTML = `
    <h2 class="modal-header-title">CARRITO</h2>

    `;
    modalContainer.append(modalHeader);
    
    const modalButton = document.createElement("h5");
    modalButton.innerText = "✖️";
    modalButton.className = "modal-header-button";

    // Desaparecemos la lista
    modalButton.addEventListener("click", () => {
        modalContainer.style.display = "none";
    });

    modalHeader.append(modalButton);

    carrito.forEach((product) => {

        let carritoContent = document.createElement("div");
        carritoContent.className = "modal-content";
        carritoContent.innerHTML = `
            <img src="${product.img}">
            <h3>${product.nombre}</h3>
            <p>$${product.precio}</p>
        `;

        modalContainer.append(carritoContent);
    });

    const total = carrito.reduce((acc, el) => acc + el.precio, 0);

    const totalBuying = document.createElement("div");
    totalBuying.className = "total-content"
    totalBuying.innerHTML = `Total a Pagar: $${total}`;
    modalContainer.append(totalBuying);
    


});