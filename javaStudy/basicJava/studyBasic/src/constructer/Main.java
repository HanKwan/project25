package constructer;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("John");
        Student student3 = new Student("Marry", 12);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.email);
    }
}
