package P09IterarorsAndComparators.Exercise.Frogy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable <Integer>{
    private List<Integer>list;

    public Lake(List<Integer> list) {
        this.list = list;
    }


    @Override
    public Iterator iterator() {
        return new Frog();
    }

    private int lastEvenIndex(){
       int totalIndexSize = list.size()-1;
       if (totalIndexSize % 2==0){
           return totalIndexSize;
       }else {
           return totalIndexSize-1;
       }
    }
    private class Frog implements Iterator<Integer>{

        int index = 0;
        int lastEven = lastEvenIndex();

        @Override
        public boolean hasNext() {
            if (index < list.size()){
                return true;
            }else {
                return false;
            }
        }

        @Override
        public Integer next() {
            if (index == lastEven){
                int num = list.get(index);
                index = 1;
                return num;
            }else {
                int num = list.get(index);
                index+=2;
                return num;
            }

        }
    }


}
