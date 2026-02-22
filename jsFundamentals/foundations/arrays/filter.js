const ages = [23, 87, 17, 8, 1, 24, 36];
const names = ["Alexandra", "Han", "Seraphina", "Phil", "May", "Maximiliano"];

const shortNames = names.filter(getShortNames);
const adults = ages.filter(getAdult);
const children = ages.filter(getChildren);

console.log(adults);
console.log(children);
console.log(shortNames);


function getChildren (element) {
    return element < 18;
}

function getAdult (element) {
    return element >= 18;
}

function getShortNames (element) {
    return element.length <= 4;
}