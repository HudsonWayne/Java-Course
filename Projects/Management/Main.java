package Projects.Management;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    Student[] students = new Student[100];
    int count = 0;

    while(true){
        System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Name");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            if (option == 1){
                System.out.println("Enter name:");
                String name = scanner.nextLine();

                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // clear buffer

                students[count] = new Student(name, age);
                count++;
                System.out.println("Student added!");
            }

    }
}


