const workers = ["Bob", "John", "Andy"];
const numbers = [4, 87, 898473, 93];
const dates = ["3.5.2016", "4.12.1998", "30.4.2027"];

const upperCasedWorkers = workers.map(toUpperCase);
const multipliedByThree = numbers.map(multipleByThree);
const formattedDates = dates.map(formattingDates);

function toUpperCase (element) {
    return element.toUpperCase();
}

function multipleByThree (element) {
    return element = element * 3;
}

function formattingDates (element) {
    const parts = element.split(".");
    return `${parts[2]}-${parts[1]}-${parts[0]}`;
}

console.log(upperCasedWorkers);
console.log(multipliedByThree);
console.log(formattedDates);
