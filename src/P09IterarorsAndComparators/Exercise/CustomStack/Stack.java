package P09IterarorsAndComparators.Exercise.CustomStack;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Stack implements Iterable<Integer> {

    private ArrayDeque<Integer> stack;
    private Object[] stackArr;

    public Stack(ArrayDeque<Integer> stack) {
        this.stack = stack;
        stackArr= new Object[stack.size()];
    }

    private void stackArrInitialisator(){
        stackArr = stack.toArray();
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
        int count = 0;

        @Override
        public boolean hasNext() {
            boolean over = false;
            if (!stack.isEmpty()) {

                if (count == 2) {
                    return over;
                } else {
                    if (index == stack.size()) {
                        count++;
                        if (count == 2) {
                            over = false;
                            return false;
                        }
                        index = 0;
                        over = true;
                    } else {
                        if (this.index < stack.size()) {
                            over = true;
                        } else {
                            over = false;
                        }
                    }
                }

            }
            return over;

        }

        @Override
        public Object next() {
            stackArrInitialisator();
           Object number = stackArr[index];
            index++;
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
