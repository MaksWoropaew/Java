package Java.Homework.work4;
import java.util.LinkedList;

public class tesk1 {
    public static LinkedList<Integer> ReverseList(LinkedList<Integer> list) {
        LinkedList<Integer> revLinkedList = new LinkedList<>();
        for (int i = list.size(); i > 0 ; i--) {
            int lastElement = list.getLast();
            list.remove(list.getLast());
            revLinkedList.addLast(lastElement);
        }
        return revLinkedList; 
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(5);
        linkedList.add(25);
        linkedList.add(125);
        linkedList.add(6);
        linkedList.add(34);
        linkedList.add(57);
        System.out.println(linkedList);
        LinkedList<Integer> result = ReverseList(linkedList);
        System.out.println(result);
    }
}
