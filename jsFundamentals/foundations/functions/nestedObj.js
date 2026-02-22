class Person {
    constructor(name, age, ...address) {
        this.name = name;
        this.age = age;
        this.address = new Address(...address);
    }
}

class Address {
    constructor(city, street, roomNo) {
        this.city = city;
        this.street = street;
        this.roomNo = roomNo;
    }
}