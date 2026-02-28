
const myBox = document.getElementById("myBox");

let movement = 30;
let x = 0;
let y = 0;

myBox.addEventListener("click", event => {
    event.target.textContent = "😖";
    event.target.style.backgroundColor = "hsla(0, 96%, 52%, 0.78)"
})

myBox.addEventListener("mouseover", event => {
    event.target.textContent = "😦";
    event.target.style.backgroundColor = "hsla(26, 94%, 52%, 0.78)"
})

myBox.addEventListener("mouseout", event => {
    event.target.textContent = "😑";
    myBox.style.backgroundColor = "hsla(0, 73%, 91%, 0.78)"
})

document.addEventListener("keyup", event => {
    myBox.textContent = "🙂";
    myBox.style.backgroundColor = "hsla(0, 92%, 77%, 0.85)"
});

document.addEventListener("keydown", event => {     // keypress doesn't include arrow keys

    myBox.textContent = "🤣";
    myBox.style.backgroundColor = "hsl(123, 80%, 71%)";

    if (event.key.startsWith("Arrow")) {
        
        switch (event.key) {
            case "ArrowUp":
                y -= movement;
                break;
            case "ArrowDown":
                y += movement;
                break;
            case "ArrowLeft":
                x -= movement;
                break;
            case "ArrowRight":
                x += movement;
                break;
            default:
                break;
        }

        myBox.style.top = `${y}px`;
        myBox.style.left = `${x}px`;
    }
})