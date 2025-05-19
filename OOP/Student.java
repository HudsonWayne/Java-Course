package OOP;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}
