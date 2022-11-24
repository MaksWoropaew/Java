package Java.Homework.work4;
import java.util.LinkedList;
import java.util.Scanner;

public class tesk2 {
    public static void enqueue(LinkedList<Integer> linkedList, int element) {
        linkedList.addLast(element);
    }

    public static int dequeue(LinkedList<Integer> linkedList) {
        return linkedList.removeFirst();
    }

    public static int first(LinkedList<Integer> linkedList) {
        return linkedList.peekFirst();

    }

    public static void menu(LinkedList<Integer> ll) {
        Scanner scan = new Scanner(System.in);
        menu: while (true) {
            System.out.print(
                    "1 - для добавления числа в очередь: \n2 - для получения первого элемента их очереди и его удаления: \n3 - для отображения первого элемента: \n");
            String input = scan.nextLine();
            switch (input) {
                case ("1"):
                    System.out.println("Введите число для добавления");
                    input = scan.nextLine();
                    int choise = Integer.parseInt(input);
                    enqueue(ll, choise);
                    System.out.println("Ваша очередь: " + ll);
                    break;

                case ("2"):
                    System.out.printf("Элемент %d был удален из очереди\n", dequeue(ll));
                    System.out.println("Ваша очередь: " + ll);
                    break;

                case ("3"):
                    int firstElement = first(ll);
                    System.out.printf("Первый элемент в очереди: %d \n", firstElement);
                    System.out.println("Ваша очередь: " + ll);
                    break;
            }
            scan.close();
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        menu(linkedList);
    }
}
