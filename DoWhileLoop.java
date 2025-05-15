import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;

        do{
            System.out.println("Do you want to continue? (yes/no):");
            answer = input.nextLine();
        } while (!answer.equalsIgnoreCase("no"));

        System.out.println("You exited the loop.");
        input.close();
    }
}
