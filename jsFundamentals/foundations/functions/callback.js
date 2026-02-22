function sum(callback, x, y) {

    console.log("It's calculating...");
    setTimeout(() => {

        let ressult = x + y;
        
        callback(ressult);
    }, 3000);

}

function displayResult(ressult) {
    console.log(`Your result is ${ressult}`);
}

sum(displayResult, 3, 4);