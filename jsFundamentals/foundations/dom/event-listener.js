
const myBox = document.getElementById("myBox");

document.addEventListener("keydown", event => {
    console.log(`keydown: ${event.key}`);  
});

document.addEventListener("keyup", event => {
    console.log(`keyup: ${event.key}`);  
});

myBox.addEventListener("click", event => {
    console.log(`clicked the smily face`);
    
})