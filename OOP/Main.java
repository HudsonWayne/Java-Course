package OOP;

public class Main {
    public static void main(String[] args) {
        // Create a person object
        Person p1 = new Person();

        //Set Values
        p1.name = "Wayne";
        p1.age = 25;

        // Call the method
        p1.sayHello();



        Car myCar = new Car();

        myCar.color = "Red";
        myCar.model = "Toyota Corolla";
        myCar.year = 2022;

        System.out.println("My car is a " + myCar.year + " " + myCar.model + " in " + myCar.color);
        myCar.startEngine();
    }





}
