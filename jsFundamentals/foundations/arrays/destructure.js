function displayPerson({firstName, lastName, age, job="unemplyed"}) {   // need to add {} for the parameters
    console.log(`This is ${firstName} ${lastName}`);
    console.log(`Age: ${age}`);
    console.log(`Job: ${job}`);
}

const person1 = {
    firstName: "Hiroshi",
    lastName: "Tanaka",
    age: 34,
    job: "Developer"
}

const person2 = {
    firstName: "Yuki",
    lastName: "Yamamoto",
    age: 28,
}

displayPerson(person2);