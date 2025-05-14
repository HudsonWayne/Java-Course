import java.util.Scanner; // import Scanner class

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner object

        System.out.print("Enter your name: ");
        String name = input.nextLine();  // read a full line of text

        System.out.print("Enter your age: ");
        int age = input.nextInt();  // read an integer

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();  // read a decimal number

        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old and " + height + " meters tall.");

        input.close(); // close the Scanner
    }
}
