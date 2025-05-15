import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;

        do{
            System.out.println("Do you want to continue? (yes/no):");
            answer = input.nextLine();
        }
    }
}
