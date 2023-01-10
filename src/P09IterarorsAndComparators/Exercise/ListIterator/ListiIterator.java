package P09IterarorsAndComparators.Exercise.ListIterator;

import java.util.Iterator;
import java.util.List;

public class ListiIterator implements Iterable<String>{
    private List<String> list;

    public ListiIterator(List<String> list) {
        this.list = list;
    }


    private int index = 0;
    private boolean isListEmpty() {
        if (this.list.size() > 0){
            return false;
        }else {
           this.index = -1;
            return true;
        }
    }

    public void print(){
        if (this.list.size() == 0){
            System.out.println("Invalid Operation!");
        }else {
            System.out.println(this.list.get(this.index));
        }
    }

    public boolean hasNext(){
        boolean desicion = false;
        if (this.index < this.list.size() - 1){
            desicion = true;
        }else if (this.index == this.list.size()-1){
            desicion = false;
        }
        return desicion;
    }
    public void printAll(){
        Iterator<String> iterator = new Assistant();
        while (iterator().hasNext()){
           // String name = iterator().next();
            System.out.print(iterator.next()+" ");
        }
    }

//    public void printAll(){
//        for (int i = 0; i < this.list.size(); i++) {
//            System.out.print(this.list.get(i)+" ");
//        }
//        System.out.println();
//    }



    public boolean move(){
        boolean desicion = false;
       if (!isListEmpty()){
           if (this.index + 1 < this.list.size()){
               this.index++;
               desicion = true;
           }else {
               desicion = false;
           }
       }
       return desicion;
    }


    @Override
    public Iterator<String> iterator() {
        return new Assistant();
    }
    int myIndex = 0;
    private class Assistant implements Iterator<String>{
        @Override
        public boolean hasNext() {
            if (myIndex < list.size()){
                return true;
            }
            return false;
        }
        @Override
        public String next() {
                String name = list.get(myIndex);
                myIndex = myIndex + 1;
                return name;
        }
    }

}
