const resultDisplay = document.getElementById("result");
const playerPick = document.getElementById("playerPick");
const computerPick = document.getElementById("computerPick");
const playerWin = document.getElementById("playerWin");
const computerWin = document.getElementById("computerWin");

const choices = ["Rock", "Scissor", "Paper"];
const winRules = {
    Rock: "Scissor",
    Paper: "Rock",
    Scissor: "Paper"
};
let playerWinCount = 0;
let computerWinCount = 0;

function playGame(playerChoice) {
    
    let computerChoice = choices[Math.floor(Math.random() * choices.length)];
    let result = "";

    if (playerChoice === computerChoice) {
        result = "It's a TIE!";  // it's not resultDisplay.textContent, its result

    } else if (winRules[playerChoice] === computerChoice) {     //-> if player choose rock and computer choose scissor,
        result = "You Win!";                                    // winRules[Rock] === Scissor
        playerWinCount++;                                       // Scissor === Scissor -> return true
    } else {
        result = "You Lose!";
        computerWinCount++;
    }

    // output display of choices and the result
    playerPick.textContent = `Player Choose: ${playerChoice}`;
    computerPick.textContent = `Computer Choose: ${computerChoice}`;
    resultDisplay.textContent = result;
    
    // default class for result
    resultDisplay.classList.remove("winResult", "loseResult");
    
    // win and lose classes for result
    if (result === "You Win!") {
        resultDisplay.classList.add("winResult");
    } else if (result === "You Lose!") {
        resultDisplay.classList.add("loseResult");
    }

    // win count display for player and computer
    playerWin.textContent = playerWinCount;
    computerWin.textContent = computerWinCount;

    updateScore();
}

// function for win and lose classes for win count: higher score for green color
function updateScore() {

    playerWin.classList.remove("winResult", "loseResult");
    computerWin.classList.remove("winResult", "loseResult");

    if (playerWinCount > computerWinCount) {
        playerWin.classList.add("winResult");
        computerWin.classList.add("loseResult");
    } else if (computerWinCount > playerWinCount) {
        computerWin.classList.add("winResult");
        playerWin.classList.add("loseResult");
    }
    
}