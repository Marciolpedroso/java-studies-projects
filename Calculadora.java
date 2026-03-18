
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = readNumber(sc, "Enter the first number: ");
        int secondNumber = readNumber(sc, "Enter the second number: ");
        int option = showMenu(sc);

        double result = calculate(firstNumber, secondNumber, option);
        System.out.println("Result: " + result);

        sc.close();
    }

    public static int readNumber(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    public static int showMenu(Scanner sc) {
        System.out.println("Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Choose an option: ");
        return sc.nextInt();
    }

    public static double calculate(int firstNumber, int secondNumber, int option) {
        switch (option) {
            case 1:
                return firstNumber + secondNumber;
            case 2:
                return firstNumber - secondNumber;
            case 3:
                return firstNumber * secondNumber;
            case 4:
                if (secondNumber != 0) {
                    return (double) firstNumber / secondNumber;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return Double.NaN;
                }
                default:
                    System.out.println("Invalid option.");
                    return Double.NaN;
        }
    }
}
