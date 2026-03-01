const resultDisplay = document.getElementById("result");
const playerPick = document.getElementById("playerPick");
const computerPick = document.getElementById("computerPick");
const playerWin = document.getElementById("playerWin");
const computerWin = document.getElementById("computerWin");
const choices = ["Rock", "Paper", "Scissor"];
let playerWinCount = 0;
let computerWinCount = 0;

function playGame(playerChoice) {
    
    let computerChoice = choices[Math.floor(Math.random() * 3)];
    let result = "";

    if (playerChoice === computerChoice) {
        result = "It's a TIE!";  // it's not resultDisplay.textContent, its result

    } else {

        switch (playerChoice) {
            case "Rock":
                result = computerChoice === "Scissor" ? "You Win!" : "You Lose!";
                break;
            case "Paper":
                result = computerChoice === "Scissor" ? "You Lose!" : "You Win!";
                break;
            case "Scissor":
                result = computerChoice === "Paper" ? "You Win!" : "You Lose!";
                break;
            default:
                break;
        }
    }
    playerPick.textContent = `Player Choose: ${playerChoice}`;
    computerPick.textContent = `Computer Choose: ${computerChoice}`;
    resultDisplay.textContent = result;
    
    resultDisplay.classList.remove("winResult", "loseResult");
    
    switch (result) {

        case "You Win!":
            resultDisplay.classList.add("winResult");
            playerWinCount++;
            break;

            case "You Lose!":
                resultDisplay.classList.add("loseResult");
                computerWinCount++;
                break;

            default:
                break;
            }

    playerWin.textContent = playerWinCount;
    computerWin.textContent = computerWinCount;

    if (playerWinCount > computerWinCount) {
        playerWin.classList.add("winResult");
        computerWin.classList.add("loseResult");
    } else if (computerWinCount > playerWinCount) {
        computerWin.classList.add("winResult");
        playerWin.classList.add("loseResult");
    } else {
        playerWin.classList.remove("winResult", "loseResult");
        computerWin.classList.remove("winResult", "loseResult");
    }
}