class Person {
    constructor(name, age, ...address) {
        this.name = name;
        this.age = age;
        this.address = new Address(...address);
    }

    getAllInfo() {
        return `Name: ${this.name}, Age: ${this.age}, Address: ${this.address.getAddress()}`
    }
}

class Address {
    constructor(city, street, roomNo) {
        this.city = city;
        this.street = street;
        this.roomNo = roomNo;
    }
    
    getAddress() {
        return `${this.roomNo}, ${this.street}, ${this.city}` 
    }
}

const person1 = new Person("Bob", 34, "Yangon", "KyoutMyoun", 102)
const person2 = new Person("Mary", 23, "Yangon", "TharMway", 412)

console.log(person1.address.getAddress());

const personInfo = person2.getAllInfo();
console.log(personInfo);
