public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First number: " + numbers[0]); // index 0
        System.out.println("Last number: " + numbers[4]);  // index 4

        // Loop through the array
        System.out.println("All numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
