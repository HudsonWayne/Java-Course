import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];  // Can store up to 100 students
        int count = 0;

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Name");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            if (option == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // clear buffer

                students[count] = new Student(name, age);
                count++;
                System.out.println("Student added!");

            } else if (option == 2) {
                System.out.println("\nAll Students:");
                for (int i = 0; i < count; i++) {
                    students[i].displayInfo();
                }

            } else if (option == 3) {
                System.out.print("Enter name to search: ");
                String searchName = scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (students[i].getName().equalsIgnoreCase(searchName)) {
                        students[i].displayInfo();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

            } else if (option == 4) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}

