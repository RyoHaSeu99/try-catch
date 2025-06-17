public class Main {
    public static void main(String[] args) {
        String input = "123";

        try {
            int number = Integer.parseInt(input);

            System.out.println("Parse number: " + number);
        } finally {
            System.out.println("Process completed.");
        }
    }
}