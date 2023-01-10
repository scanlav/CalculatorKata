import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите данные в формате \"a + b\"");
            String input = scanner.nextLine();
            String result_data = calc(input);
            if (result_data == "throws Exception") {
                System.out.println(result_data);
                break;
            } else {
                System.out.println(result_data);
            }
        }

    }
    public static String calc(String input) {
        int result = 0;
        try {

            String[] input_data = input.split(" ");

            int a = Integer.parseInt(input_data[0]);
            int b = Integer.parseInt(input_data[2]);
            String arithmetic_operation = input_data[1];
            if (input_data.length >= 4) {
                throw new Exception();
            } else if ((a >= 1 && a <= 10) && (b >= 1 && b <= 10)) {
                switch (arithmetic_operation) {
                    case "+" -> result = a + b;
                    case "-" -> result = a - b;
                    case "*" -> result = a * b;
                    case "/" -> result = a / b;
                    default -> throw new Exception();
                }
            } else {
                throw new Exception();
            }
        } catch (Exception exception) {
            return "throws Exception";
        }
        return Integer.toString(result);
    }
}