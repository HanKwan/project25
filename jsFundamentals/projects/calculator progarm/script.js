
let display = document.getElementById("display");
let firstNumber = "";
let operator = "";
let secondNumber = "";

function inputValue(value) {

    if (operator === "") {
        firstNumber += value;
    } else {
        secondNumber += value;
    }

    display.value += value;

}

function inputOperator(op) {
    
    if (firstNumber === "" && op === "-") {
        firstNumber = "-";
        display.value = "-";
        return;
    }

    if (firstNumber === "-") {
        return;
    }

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
        case "/": 
            if (secondNum === 0) {
                    display.value = "Error";
                    firstNumber = "";
                    operator = "";
                    secondNumber = "";
                    return;
                } 
                result = firstNum / secondNum; break;
        default:
            return;
    }

    firstNumber = parseFloat(result.toFixed(2).toString());
    secondNumber = "";
    operator = "";

}

function updateDisplay() {
    calculate();
    if (firstNumber) {
        display.value = firstNumber;
    }
}