
const display = document.getElementById("displayTimer");
let timer = null;
let startTime = 0;
let elapsedTime = 0;
let isRunning = false;

function start() {
    
    if (!isRunning) {
        isRunning = true;
        startTime = Date.now() - elapsedTime;
        timer = setInterval(displayTimer, 10); 
    }
}

function stop() {
    
}

function reset() {
    
}

function displayTimer() {

    const currentTime = Date.now();
    elapsedTime = currentTime - startTime;

    let hours = Math.floor(elapsedTime / (1000 * 60 * 60));
    let mins = Math.floor((elapsedTime / (1000 * 60)) % 60);
    let secs = Math.floor((elapsedTime / 1000) % 60);
    let milisecs = Math.floor((elapsedTime % 1000) / 10);

    hours = hours.toString().padStart(2, 0);
    mins = mins.toString().padStart(2, 0);
    secs = secs.toString().padStart(2, 0);
    milisecs = milisecs.toString().padStart(2, 0);

    display.textContent = `${hours}:${mins}:${secs}:${milisecs}`;
}