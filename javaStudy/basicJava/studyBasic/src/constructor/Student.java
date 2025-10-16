package constructor;

public class Student {

    String name;
    int age;
    String email;

    Student () {
        this.name = "New student";
        this.age = 0;
        this.email = "not provided";
    }

    Student (String name) {
        this.name = name;
        this.age = 0;
        this.email = "not provided";
    }

    Student (String name, int age) {
        this.name = name;
        this.age = age;
        this.email = "not provided";
    }

    Student (String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

}
