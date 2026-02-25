
let display = document.getElementById("display");
let firstNumber = "";
let operator = "";
let secondNumber = "";
let isNewInput = false;

console.log(firstNumber);

function inputValue(value) {

    if (operator === "") {
        firstNumber += value;
        display.value = firstNumber;
    } else {
        secondNumber += value;
        display.value += value;
    }
    console.log(`first ${firstNumber}`);
    console.log(`second ${secondNumber}`);
    
}

function inputOperator(op) {

    if (operator && secondNumber === "") {
        return;
    }

    if (firstNumber && secondNumber) {
        calculate();
    }

    operator = op;
    display.value += operator;
}

function clearValue() {

    firstNumber = "";
    operator = "";
    secondNumber = "";
    display.value = "";
}

function calculate() {

    let firstNum = parseFloat(firstNumber);
    let secondNum = parseFloat(secondNumber);
    let result;

    switch (operator) {
        case "+": result = firstNum + secondNum; break;
        case "-": result = firstNum - secondNum; break;
        case "*": result = firstNum * secondNum; break;
        case "/": result = firstNum / secondNum; break;
        default:
            return;
    }

    firstNumber = result.toString();
    secondNumber = "";
    operator = "";

}

function updateDisplay() {
    calculate();
    display.value = firstNumber;
}