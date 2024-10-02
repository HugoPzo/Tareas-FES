// Cajas de Juegos
const cardContainer = document.querySelector(".container__card");

// Carrito de Compras
const imgCart = document.querySelector(".cart__img");
const cartBox= document.querySelector(".cart__box");


// Logos de Videojuegos
const xboxLogo = document.querySelector("#img_xbox");
const playLogo = document.querySelector("#img_playstation");
const nintendoLogo = document.querySelector("#img_nintendo");

// Footer
const footer = document.querySelector(".footer")

let itemsCart = [];


function appendItems(game){
    let card = document.createElement("div");
    card.className = "card__item";
    card.innerHTML = `
    <img  src="${game.img}">
    <h3 class="item_element item_name">${game.name}</h3>
    <p class="item_element">${game.descripcion}</p>
    <p class="item_element">$ ${game.precio}</p>
    `

    cardContainer.append(card);

    let cardButton = document.createElement("button");
    cardButton.className = "item_element item_button";
    cardButton.innerText = "BUTTON";
    cardButton.innerHTML = `<a class="button_element"><span>Button</span></a> `;
    
    card.append(cardButton);

    cardButton.addEventListener("click", () => {

        const exists = itemsCart.some(games => games.id === game.id);

        if (exists){
            // Actualizamos Cantidad
            const juegos = itemsCart.map(games => {
                if(games.id === game.id){
                    games.cantidad++;
                    return games;
                }else{
                    return games;
                }
            });
            itemsCart = [...juegos] 
        }else{

            itemsCart.push({
                id: game.id,
                img: game.img,
                nombre: game.name,
                precio: game.precio,
                consola: game.consola,
                cantidad: game.cantidad
            })

        }

        console.log(itemsCart);

    })

    card.addEventListener("click", () =>{
        
    })
}

// Añadir Cards a HTML
elements.forEach((game) =>{
    appendItems(game);
})

// Registrar Acciones
registrarListener();
function registrarListener(){
    imgCart.addEventListener("click", showCart);

    xboxLogo.addEventListener("click", showXboxItems)
    playLogo.addEventListener("click", showPlayItems)
    nintendoLogo.addEventListener("click", showNintendoItems)
}

// Mostrar Carro
function showCart(evt){
    cartBox.innerHTML = ``;
    cartBox.style.display = "flex";

    const cartBoxTitle = document.createElement("div");
    cartBoxTitle.className = "box__title";
    cartBoxTitle.innerHTML = `
    <h2 class="box--title">CARRITO</h2>`
    
    cartBox.append(cartBoxTitle);

    const boxButton = document.createElement("button");
    boxButton.innerText = "X";
    boxButton.className = "box__button";


    boxButton.addEventListener("click", () =>{
        cartBox.style.display = "none"
    })

    cartBoxTitle.append(boxButton);

    const elementsTitle = document.createElement("div");
    elementsTitle.className = "box__elements";
    elementsTitle.innerHTML = `
    <h5>Imagen</h5>
    <h5>Titulo</h5>
    <h5>Precio</h5>
    <h5>Cantidad</h5>
    `

    cartBox.append(elementsTitle)

    const boxItemsContainer = document.createElement("div");
    boxItemsContainer.className = "box__itemsContainer";
    
    cartBox.append(boxItemsContainer);

    itemsCart.forEach((game) =>{


        let box__item = document.createElement("div");
        box__item.className = "box__item";
        box__item.innerHTML = `
            <img class="item--image" src="${game.img}">
            <h4>${game.nombre}</h4>
            <p>$${game.precio}</p>
            <p>${game.cantidad}</p>
        `

        let item__delete = document.createElement("button");
        item__delete.className = "item__delete";
        item__delete.innerText = "X";
        
        box__item.append(item__delete);


        item__delete.addEventListener("click", ()=>{
    
            while(box__item.firstChild){
                box__item.removeChild(box__item.firstChild);
            }

            const removeItem = itemsCart.indexOf(game);
            itemsCart.splice(removeItem, 1);

        })

        boxItemsContainer.append(box__item);
    })



    const total = itemsCart.reduce((acc, game) => acc + parseInt(game.precio) * game.cantidad, 0);

    const box__price = document.createElement("div");
    box__price.className = "box__price";
    box__price.innerHTML = `Total a Pagar: $${total.toFixed(2)}`;

    cartBox.append(box__price);

}

// Eliminar Elementos
function deleteItems(){
    while (cardContainer.firstChild){
        cardContainer.removeChild(cardContainer.firstChild)
    }
}

// Games Items

function showXboxItems(){
    deleteItems();
    elements.forEach((game) =>{
        if(game.consola === "xbox"){  
            appendItems(game);
        }
    })
}

function showPlayItems(){
    deleteItems();
    elements.forEach((game) =>{
        if(game.consola === "playstation"){
            appendItems(game);         
        }
    })
}

function showNintendoItems(){
    deleteItems();
    elements.forEach((game) =>{
        if(game.consola === "nintendo"){
            appendItems(game);         
        }
    })
}

function showVideo(){
    if(footer.classList.contains("activo")){
        
    }
}