function sayHello(callback) {
    setTimeout(() => {
        console.log("hello");
        callback();
    }, 3000);
}

function sayGoodbye() {
    console.log("bye");
}

sayHello(sayGoodbye);