const shopContent = document.getElementById("shopContent");

const webtitle = document.getElementById("webTitle");
const xboxLogo = document.querySelector("#logoXbox");
const playLogo = document.querySelector("#logoPlay");
const nintendoLogo = document.querySelector("#logoNintendo");
const homeLogo = document.querySelector("#logoHome");

const imagCarrito = document.querySelector("#imagen_carrito");
const shoppingCarrito = document.querySelector("#shoppingCart");

const borrarElemento = document.querySelector(".borrar-curso")



// Lista Carrito
let carrito = [];

// Pagina por defecto

allElements.forEach((product) =>{

    let content = document.createElement("div");
    content.className = "card";
    content.innerHTML = `
        <img class="imagenes_ropa" src="${product.img}">
        <h2>${product.nombre}</h2>
        <p>${product.descripcion}</p>
        <p>$ ${product.precio}</p>
    `;

    shopContent.append(content);

    let comprar = document.createElement("button");
    comprar.className = "botton_comprar";
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

// Eventos Logo 

homeLogo.addEventListener("click", () =>{

    while (shopContent.firstChild) {
        shopContent.removeChild(shopContent.firstChild);
    }

    allElements.forEach((product) =>{

        let content = document.createElement("div");
        content.className = "card";
        content.innerHTML = `
            <img class="imagenes_ropa" src="${product.img}">
            <h2>${product.nombre}</h2>
            <p>${product.descripcion}</p>
            <p>$ ${product.precio}</p>
        `;
    
        shopContent.append(content);
    
        let comprar = document.createElement("button");
        comprar.className = "botton_comprar";
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

})

webtitle.addEventListener("click", () =>{
    while (shopContent.firstChild) {
        shopContent.removeChild(shopContent.firstChild);
    }

    allElements.forEach((product) =>{

        let content = document.createElement("div");
        content.className = "card";
        content.innerHTML = `
            <img class="imagenes_ropa" src="${product.img}">
            <h2>${product.nombre}</h2>
            <p>${product.descripcion}</p>
            <p>$ ${product.precio}</p>
        `;
    
        shopContent.append(content);
    
        let comprar = document.createElement("button");
        comprar.className = "botton_comprar";
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
})


xboxLogo.addEventListener("click", () =>{

    while (shopContent.firstChild) {
        shopContent.removeChild(shopContent.firstChild);
    }

    xboxElements.forEach((product) =>{

        let content = document.createElement("div");
        content.className = "card";
        content.innerHTML = `
            <img class="imagenes_ropa" src="${product.img}">
            <h2>${product.nombre}</h2>
            <p>${product.descripcion}</p>
            <p>$ ${product.precio}</p>
        `;
    
        shopContent.append(content);
    
        let comprar = document.createElement("button");
        comprar.className = "botton_comprar";
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

});


playLogo.addEventListener("click", () =>{
    
    while (shopContent.firstChild) {
        shopContent.removeChild(shopContent.firstChild);
    }

    playElements.forEach((product) =>{

        let content = document.createElement("div");
        content.className = "card";
        content.innerHTML = `
            <img class="imagenes_ropa" src="${product.img}">
            <h2>${product.nombre}</h2>
            <p>${product.descripcion}</p>
            <p>$ ${product.precio}</p>
        `;
    
        shopContent.append(content);
    
        let comprar = document.createElement("button");
        comprar.className = "botton_comprar";
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

});


nintendoLogo.addEventListener("click", () =>{
    
    while (shopContent.firstChild) {
        shopContent.removeChild(shopContent.firstChild);
    }

    nintendoElements.forEach((product) =>{

        let content = document.createElement("div");
        content.className = "card";
        content.innerHTML = `
            <img class="imagenes_ropa" src="${product.img}">
            <h2>${product.nombre}</h2>
            <p>${product.descripcion}</p>
            <p>$ ${product.precio}</p>
        `;
    
        shopContent.append(content);
    
        let comprar = document.createElement("button");
        comprar.className = "botton_comprar";
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

});


// Carrito de Compras ----------------------

imagCarrito.addEventListener("click", showEvent);
imagCarrito.addEventListener("mouseover", showEvent);

function showEvent(e){  

    shoppingCarrito.innerHTML = ``;

    shoppingCarrito.style.display = "flex";
    
    const carTitle = document.createElement("div");
    carTitle.className = "carTitle";
    carTitle.innerHTML = `
    <h3 class="titleCar">Carrito</h2>
    `;
    shoppingCarrito.append(carTitle);

    const carCloseButton = document.createElement("img");
    carCloseButton.src = "../IMG_Xbox/cerca.png";
    carCloseButton.className = "carCloseButton";
    carTitle.append(carCloseButton);

    carCloseButton.addEventListener("click", () =>{
        shoppingCarrito.style.display = "none";
    })

    //imagCarrito.addEventListener("mouseout", () =>{
    //    shoppingCarrito.style.display = "none";
    //})

    carrito.forEach((product) => {

        let carritoContent = document.createElement("div");
        carritoContent.className = "modal-content";
        carritoContent.innerHTML = `
            <img src="${product.img}">
            <h3>${product.nombre}</h3>
            <p>$${product.precio}</p>
            <a href="#" class="borrar-curso"
            data-id = "${product.id}">(x) </a>
        `;

        shoppingCarrito.append(carritoContent);
    });

    

    const total = carrito.reduce((acc, el) => acc + el.precio, 0);

    const totalBuying = document.createElement("div");
    totalBuying.className = "total-content"
    totalBuying.innerHTML = `Total a Pagar: $${total}`;
    shoppingCarrito.append(totalBuying);


}



borrarElemento.addEventListener("click", borrarJuego);

function borrarJuego(e){
    console.log("fasas");
}







    

    

    