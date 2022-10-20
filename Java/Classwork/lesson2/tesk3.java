package Java.Classwork.lesson2;
// Напишите метод, который составит строку, состоящую из 10 повторений слова TEST и метод, 
// который запишет эту строку в простой текстовый файл, обработайте исключения.

import java.io.FileWriter;

public class tesk3 {

    public static void main(String[] args){
        int n = 10;
        String text = "TEST ";
        try {
            FileWriter file = new FileWriter("file.txt", false);
            System.out.println("Complite");
            for(int i = 0; i < n; i++){
            file.write(text);
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Exception");
        }
      
    }
}
