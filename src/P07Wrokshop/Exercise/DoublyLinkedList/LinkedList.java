package P07Wrokshop.Exercise.DoublyLinkedList;

import java.util.function.Consumer;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;



    public void addFirst(int element){
        Node newNode = new Node(element);

        if (this.size == 0){
            this.head = newNode;
            this.tail = newNode;
        }else {
            newNode.nextNode = this.head;
            this.head.prevNode = newNode;
            this.head = newNode;
        }
        this.size++;
    }

    public void addLast(int element){

        Node newNode = new Node(element);
        if (this.size == 0){
            this.head = newNode;
            this.tail = newNode;
        }else {
            newNode.prevNode = this.tail;
            this.tail.nextNode = newNode;
            this.tail = newNode;
        }
        this.size++;
    }


    public int get(int index){
        if (indexValidation(index)){
           if (index <= this.size / 2 ){
               //firstPartOfList
               Node node = this.head;
               for (int i = 0; i < index ; i++) {
                   node = node.nextNode;
               }
               return node.currentValue;

           }else {
               //secondPartOfList
               Node node = this.tail;
               for (int i = this.size-1; i > index ; i--) {
                   node = node.prevNode;
               }
               return node.currentValue;
           }
        }else {
            throw new IndexOutOfBoundsException("Index "+index+" out of bounds for LinkedList");
        }
    }

    private boolean indexValidation(int index) {
        return index >= 0 && index < this.size;
    }

    public int removeFirst(){

        if (this.size == 0){
            throw new IndexOutOfBoundsException("LinkedList empty");
        }else if (this.size == 1 ){
            this.head = this.tail = null;
            this.size--;
            return this.head.currentValue;
        }else {
            this.size--;
            int valueToReturn = this.head.currentValue;
            this.head = this.head.nextNode;
            this.head.prevNode = null;
            return valueToReturn;
        }

    }
    public int removeLast(){

        if (this.size == 0 ){
            throw new IndexOutOfBoundsException("Linked list empty");
        } else if (this.size == 1 ) {
            this.size--;
            this.head = this.tail = null;
            return this.tail.currentValue;
        }else {
            this.size--;
            this.tail.prevNode.nextNode = null;
            this.tail = this.tail.prevNode;

            return this.tail.currentValue;
        }
    }

    public void forEach(Consumer <Integer> consumer){
        Node node = this.head;
        for (int i = 0; i < this.size; i++) {
            int element = node.currentValue;
            consumer.accept(element);
            node = node.nextNode;

        }
    }

    public int[] toArray(){

        int[] arr = new int[this.size];
        Node node = this.head;
        for (int i = 0; i < this.size; i++) {
            int currentValue = node.currentValue;
            arr[i] = currentValue;
            node = node.nextNode;
        }
        return arr;
    }
}
