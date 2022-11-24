package Java.Homework.work3;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
import java.util.ArrayList;

public class tesk3 {
    public static int max(ArrayList<Integer> numbers) {
        int max = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static int min(ArrayList<Integer> numbers) {
        int min = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    public static float srArifm(ArrayList<Integer> numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);   
        }
        float srAr = sum / numbers.size();

        return srAr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            listNumbers.add(i, i + 1);
        }
        System.out.println(listNumbers);
        System.out.printf("Max value - %d;", max(listNumbers));
        System.out.printf(" Min value - %d;", min(listNumbers));
        System.out.printf(" SrArifm - %.1f", srArifm(listNumbers));
    }    
}
