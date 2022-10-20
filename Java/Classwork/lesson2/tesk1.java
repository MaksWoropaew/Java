// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

package Java.Classwork.lesson2;

import java.util.Scanner;

public class tesk1 {
    public static void main(String[] args){
        System.out.println("Введите число N :");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        iScanner.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            if (i%2 == 0){
                sb.append("A");
            }
            else {
                sb.append("a");
            }
        }
        System.out.println(sb.toString());   
    }
}