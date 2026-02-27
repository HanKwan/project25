
function display() {
    
    const now = new Date();
    let hours = now.getHours();
    const amPm = hours >= 12 ? "PM" : "AM";
    hours = hours % 12 || 12;
    hours = hours.toString().padStart(2, 0);
    const mins = now.getMinutes().toString().padStart(2, 0);
    const sec = now.getSeconds().toString().padStart(2, 0);
    const theClock = `${hours}:${mins}:${sec} ${amPm}`
    document.getElementById("clock").textContent = theClock;

}

setInterval(display);
display();