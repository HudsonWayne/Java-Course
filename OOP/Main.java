package OOP;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        //Add students to the array
        students[0] = new Student("John", 20);
        students[1] = new Student("Alice", 22);
        students[2] = new Student("Bob", 21);

        for (int i = 0; i < students.length; i++) {
            students[i].introduce();
    }
    }
}
