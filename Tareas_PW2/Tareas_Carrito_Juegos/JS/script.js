const shopContent = document.getElementById("shopContent");

const webtitle = document.getElementById("webTitle")
const xboxLogo = document.querySelector("#logoXbox");
const playLogo = document.querySelector("#logoPlay");
const nintendoLogo = document.querySelector("#logoNintendo");
const homeLogo = document.querySelector("#logoHome")

let carrito = [];

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

// Hacer Carritols
