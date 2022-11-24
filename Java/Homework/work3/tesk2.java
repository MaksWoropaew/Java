package Java.Homework.work3;
//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;

public class tesk2 {
    public static ArrayList<Integer> evenDelete(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
        return numbers;
    }
    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        for (int i = 1; i < 21; i++) {
            listNumbers.add(i);
        }
        System.out.println(listNumbers);
        System.out.println(evenDelete(listNumbers));
    }
}
