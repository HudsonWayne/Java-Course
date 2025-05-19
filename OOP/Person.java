package OOP;

public class Person {
    //Fields Variables
    String name;
    int age;

    //Constructors is an automatic method that runs automatically when an object is created
    public Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

     // Method
     void sayHello() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}
