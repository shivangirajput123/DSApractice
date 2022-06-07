// document.querySelector("#input").addEventListener("keydown",(event) =>{
//     if(event.key === ){
//         const input=document.querySelector("#input");
//         addItem(input.value);
//     }
// })

document.querySelector("#add_item").addEventListener("click",() =>{
        const input=document.querySelector("#add_item");
        addItem(input.value);
})

addItem = (input) =>{
    const item=document.createElement("div");
    const div=document.createElement("div");
    const checkItem=document.createElement("i");
    const trashItem=document.createElement("i");
    const text=document.createElement("p");


    item.className=item;
    text.textContent=input;

    checkItem.className="fa-solid fa-square-check";
    checkItem.style.color="white";

    checkItem.addEventListener("click",() =>{
        checkItem.style.color="green";
    })
    div.appendChild(checkItem);


    trashItem.className="fa-solid fa-trash-arrow-up";
    trashItem.style.color="white";

    trashItem.addEventListener("click",() =>{
        trashItem.remove();
    })
    div.appendChild(trashItem);



document.querySelector("#to_do_list").appendChild("input");
document.querySelector("add_item").value="";
}

