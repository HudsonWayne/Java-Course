public class NamesArray {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Carol", "Dave"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + names[i]);
        }
    }
}
