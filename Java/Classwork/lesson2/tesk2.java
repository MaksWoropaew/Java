// Текст задачи:
//  Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
// Ответ: результат - a4b3cd2 для примера

package Java.Classwork.lesson2;

import java.util.Scanner;

public class tesk2 {
    public static void main(String[] args){
        System.out.println("Введите строку: ");
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.nextLine();
        iScanner.close();
        System.out.println(name.charAt(0));
        for (int i = 0; i < name.length(); i++){
            
        }
         System.out.println();
    }
}
