package Java.Classwork.lesson1;
// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;
    class ArraySort{
        public static void main(String[] args) {
            int[] arr = { 3,2,2,3,5,6 };
            Arrays.sort(arr);    
            for (int values : arr) {
                System.out.print(values + ", ");
            }
        }
    }
        

