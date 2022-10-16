package Java.Homework.work1;
import java.util.Scanner;


public class tesk1 {
    public static void main(String [] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        String number = iScanner.nextLine();
        System.out.printf("Факториал(f) или треугольное число(n)? : ");
        String getFunction = iScanner.nextLine();
        String f = "f";
        Integer numbers = Integer.parseInt(number);
        if (getFunction.equals(f)){
            getFactorial(numbers);            
        }
        else getSum(numbers);
        iScanner.close();
    }
    public static int getFactorial(int numbers) {
        int result = 1;
        for (int i = 1; i <= numbers; i++) {
           result = result * i;
        }
        System.out.printf("Факториал числа: " + result);
        return result;
    }
      
    public static int getSum(int numbers) {
        int result = 1;
        for (int i = 1; i <= numbers; i++) {
           result = result + i;
        }
        System.out.printf("Треугольное число: " + result);
        return result;
    }
}
