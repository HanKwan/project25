const increaseBtn = document.getElementById("increaseBtn");
const decreaseBtn = document.getElementById("decreaseBtn");
const resetBtn = document.getElementById("resetBtn");
const countLable = document.getElementById("countLable");
let count = 0;

increaseBtn.onclick = function() {
    count++;
    countLable.textContent = count;    

    if (count > 0) {
    countLable.style.color = "green";
    } else if (count < 0) {
        countLable.style.color = "red";
    } else {
        countLable.style.color = "black";
    }
}

resetBtn.onclick = function() {
    count = 0;
    countLable.textContent = count;

    if (count > 0) {
    countLable.style.color = "green";
    } else if (count < 0) {
        countLable.style.color = "red";
    } else {
        countLable.style.color = "black";
    }
}

decreaseBtn.onclick = function() {
    count--;
    countLable.textContent = count;

    if (count > 0) {
        countLable.style.color = "green";
    } else if (count < 0) {
        countLable.style.color = "red";
    } else {
        countLable.style.color = "black";
    }    
}
