const resultDisplay = document.getElementById("result");
const playerPick = document.getElementById("playerPick");
const computerPick = document.getElementById("computerPick");
const choices = ["Rock", "Paper", "Scissor"];

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
            break;
        case "You Lose!":
            resultDisplay.classList.add("loseResult");
            break;
        default:
            break;
    }
}