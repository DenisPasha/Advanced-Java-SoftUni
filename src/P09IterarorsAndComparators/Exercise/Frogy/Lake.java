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
    private class Frog implements Iterator<Integer>{
        int index = 0;



        @Override
        public boolean hasNext() {

            boolean desicion = true;
            int lastEvenIndex = 0;
            int lastOddIndex = 0;

            if (list.size()-1 % 2 ==0){
                lastEvenIndex = list.size()-1;
                lastOddIndex = list.size()-2;
            }else {
                lastEvenIndex = list.size()-2;
                lastOddIndex = list.size()-1;
            }

            if (this.index-2 == lastOddIndex){
                return false;
            }

            if (this.index != lastEvenIndex+2){
                return true;
            }else {
                index = 1;
            }

            if (this.index == lastOddIndex){
                desicion = false;
            }

            return desicion;
        }

        @Override
        public Integer next() {
            int number = list.get(this.index);
            if (hasNext()){
                this.index= this.index + 2;

            }
          return number;
        }

    }


}
