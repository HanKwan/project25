
let display = document.getElementById("display");
let firstNumber = "";
let operator = "";
let secondNumber = "";

function inputValue(value) {

    if (firstNumber === "" && value === ".") {  // make .1 to 0.1 when enter for firstNumber
        firstNumber += "0.";
        display.value += "0."
        return;
    }

if (firstNumber && value === ".") {     // make .1 to 0.1 when enter for secondNumber
        secondNumber += "0.";
        display.value += "0."
        return;
    }

    if (operator === "") {      // set values for firstNumber and secondNumber
        firstNumber += value;
    } else {
        secondNumber += value;
    }

    display.value += value;

}

function inputOperator(op) {
    
    if (firstNumber === "" && op === "-") { // let user enter negative num on first enter
        firstNumber = "-";
        display.value = "-";
        return;
    }

    if (firstNumber === "-") {  // prevent user for entering 2 "-"
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

function calculate() {  // calculate in silent

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

    firstNumber = parseFloat(result.toFixed(2).toString()); //-> make result to 2 decimal,
    secondNumber = "";                                      // parseFloat so it singal digit is not like 1.00
    operator = "";                                          // and turn it to string to print on display <-

}

function updateDisplay() {  // only show result when enter = 
    calculate();
    if (firstNumber) {
        display.value = firstNumber;
    }
}