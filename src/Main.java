public class Main {
    public static void main(String[] args) {
        String input = "123a";

        try {
            int number = Integer.parseInt(input);
        } catch(NumberFormatException e) {
            System.out.println("숫자 포맷이 아닙니다");
        }

    }
}