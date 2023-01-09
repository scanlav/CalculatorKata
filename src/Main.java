

public class Main {
    public static void main(String[] args) {

//        System.out.println(calc("1 # 2"));

        System.out.println(calc("1 + 2"));
        System.out.println(calc("1 / 5"));
        System.out.println(calc("5 - 1"));
        System.out.println(calc("2 * 9"));

//        System.out.println(calc("20 + 4"));

//        System.out.println(calc("1"));

//        System.out.println(calc("1 + 2 + 3"));

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