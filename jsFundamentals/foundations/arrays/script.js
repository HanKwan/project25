const workers = ["Bob", "John", "Andy"];
const numbers = [4, 87, 898473, 93];

const upperCasedWorkers = workers.map(toUpperCase);
const multipliedByThree = numbers.map(multipleByThree);

function toUpperCase (element) {
    return element.toUpperCase();
}

function multipleByThree (element) {
    return element = element * 3;
}

console.log(upperCasedWorkers);
console.log(multipliedByThree);
