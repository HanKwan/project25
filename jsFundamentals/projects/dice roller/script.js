

function rollDice () {
    const userInput = document.getElementById("userInput").value;
    const myResult = document.getElementById("myResult");
    const diceImg = document.getElementById("diceImg");
    let images = [];
    let numOfDice = [];

    for (let i = 0; i < userInput; i++) {
        let randomNum = Math.floor(Math.random() * 6) + 1;
        numOfDice.push(randomNum);
        images.push(`<img src="dice_images/${randomNum}.svg" alt="dice ${randomNum}">`);
    }
    
    console.log(numOfDice);
    
    myResult.textContent = `You rolled ${numOfDice.join(', ')}`;
    diceImg.innerHTML = images.join('');
}