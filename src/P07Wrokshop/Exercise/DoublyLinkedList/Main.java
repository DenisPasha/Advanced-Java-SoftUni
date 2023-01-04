package P07Wrokshop.Exercise.DoublyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(5);
        System.out.println();
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(23);
        linkedList.addFirst(232);
        System.out.println();

       int[] arr = linkedList.toArray();
        System.out.println();


    }
}
