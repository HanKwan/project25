let count = 0;
const counterNum = document.querySelector('#counterNum');
const increaseBtn = document.querySelector('#increaseBtn');
const resetBtn = document.querySelector('#resetBtn');
const decreaseBtn = document.querySelector('#decreaseBtn');

increaseBtn.addEventListener('click', function(e){
    e.preventDefault();   // dont forget to add ()
    count++;
    counterNum.textContent = count;
    if (count > 0) {     // cant use id name in if
        counterNum.classList.add('greenNum');
    } else if (count < 0) {
        counterNum.classList.add('redNum');
    } else {
        counterNum.removeAttribute('class');
    }
})

decreaseBtn.addEventListener('click', function(e){
    e.preventDefault();
    count--;
    counterNum.textContent = count;
    if (count > 0) {
        counterNum.classList.add('greenNum');
    } else if (count < 0) {
        counterNum.classList.add('redNum');
    } else {
        counterNum.removeAttribute('class');
    }
})

resetBtn.addEventListener('click', function(e) {
    e.preventDefault();
    count = 0;
    console.log(count);
    counterNum.textContent = count;
    if (count > 0) {
        counterNum.classList.add('greenNum');
    } else if (count < 0) {
        counterNum.classList.add('redNum');
    } else {
        counterNum.removeAttribute('class');
    }
})