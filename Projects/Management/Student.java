package Projects.Management;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);

        
    }
}
