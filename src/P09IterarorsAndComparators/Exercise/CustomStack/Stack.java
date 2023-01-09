package P09IterarorsAndComparators.Exercise.CustomStack;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Stack implements Iterable<Integer> {

    private ArrayDeque<Integer> stack ;

    public Stack(ArrayDeque<Integer> stack) {
        this.stack = stack;
    }


    public void push(int element){
        this.stack.push(element);
    }
    public int pop(){
        if (this.stack.size() == 0){
            System.out.println("No elements");
            return -1;
        }else {
            return this.stack.pop();
        }

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Assistant();
    }
    private class Assistant implements Iterator{

        int index = 0;
        @Override
        public boolean hasNext() {
            if (this.index < stack.size() ){
                return true;
            }else {
                return false;
            }

        }

        @Override
        public Object next() {
            int number = stack.pop();
            return number;
        }
    }

//    public void forEach(){
//        int index = 2;
//        while (index > 0){
//            this.stack.forEach(e-> System.out.println(e));
//            index--;
//        }
//
//    }



}
