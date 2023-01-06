import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String help = """
                Калькулятор принимает данные в формате "a + b"
                Поддерживаются стандартные арифметические операции (+, -, *, /), а так же целые арабские цифры (1 - 10)
                Калькулятор не принимает римские цифры, строки, или иные операции, не предусмотренные инструкцией. На ноль делить нельзя.
                Для получения справки введите "help"
                Для выхода из приложения введите "exit"
                """;

        System.out.println(help);
        Scanner in = new Scanner(System.in);


        try {
            while (true) {
                System.out.println("Введите данные для вычисления: ");
                String input = in.nextLine();
                if (input.equalsIgnoreCase("help")) {
                    System.out.println(help);
                } else if (input.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    String[] input_data = input.split(" ");

                    int a = Integer.parseInt(input_data[0]);
                    int b = Integer.parseInt(input_data[2]);
                    String arithmetic_operation = input_data[1];

                    if ((a >= 1 && a <= 10) && (b >= 1 && b <= 10)) {
                        switch (arithmetic_operation) {
                            case "+" -> System.out.println(a + b);
                            case "-" -> System.out.println(a - b);
                            case "*" -> System.out.println(a * b);
                            case "/" -> System.out.println(a / b);
                            default -> throw new Exception();
                        }
                    } else {
                        throw new Exception();
                    }
                }
            }
        } catch (Exception exception) {
            System.out.println("Введенные данные не верны. Внимательно читайте инструкцию.");
        }
    }
}