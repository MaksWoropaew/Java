package Java.Homework.work4;
import java.util.Scanner;
import java.util.Stack;

public class tesk3 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input number one ");
            int number1 = scan.nextInt();
            System.out.print("Input arithmetic operation ");
            String oper = scan.next();
            System.out.print("Input number two ");
            int number2 = scan.nextInt();

            switch(oper) {
                case "+": System.out.printf("%d + %d = %d", number1, number2, number1 + number2);
                break;
                case "-": System.out.printf("%d - %d = %d", number1, number2, number1 - number2);
                break;
                case "*": System.out.printf("%d * %d = %d", number1, number2, number1 * number2);
                break;
                case "/": System.out.printf("%d / %d = %d", number1, number2, number1 / number2);
                break;
            }

            System.out.println("\nХотите отменить операцию?\nВведите 'yes'\nВведите 'no' для продолжение\nВведите 'quit' для выхода");
            String choice = scan.next();

            if (choice.equals("yes")) {
                System.out.println("Первое число: " + st.peek());
                System.out.printf("Введите второе число: ");
                st.push(scan.nextInt());
                choice = scan.next();
            }
            
            if (choice.equals("no")) {
                continue;
            }
            if (choice.equals("quit")) {
                break;
            }
        }
    }
}
