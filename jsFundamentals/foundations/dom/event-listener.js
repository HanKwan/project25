
const myBox = document.getElementById("myBox");

let movement = 30;
let x = 0;
let y = 0;

document.addEventListener("keyup", event => {
    myBox.textContent = "🙂";
    myBox.style.backgroundColor = "hsla(0, 64%, 56%, 0.78)"
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