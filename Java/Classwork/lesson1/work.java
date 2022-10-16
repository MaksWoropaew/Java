package Java.Classwork.lesson1;
// import java.util.Scanner;
public class work{
    public static void main(String [] args){
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Hay, " + name);
//         iScanner.close();

// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
        int [] arr = new int []{1,1,0,1,1,1};
        int max = 0, maxC = 0;
        for (int item : arr){
            if (item == 1){
                max++;
            }
            if (item == 0){
                if(maxC < max){
                    maxC = max;                    
                }
                max = 0;
            }        
        } 
        if(maxC < max){
            maxC = max;
        }
        System.out.printf("Максималоное число совпадений подряд: " + maxC);            
    }
}



