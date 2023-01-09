package P09IterarorsAndComparators.Exercise.ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {

    private List<String> list;
    private int index;

    public ListyIterator(List<String> list) {
        this.list = list;
    }

    private void Index(){
        if (list.size() == 0){
            index = -1;
        }else {
            index = 0;
        }
    }

    public boolean Move(){
        if (this.index + 1 <= this.list.size() - 1 ){
            index++;
            return true;
        }else {
            return false;
        }
    }

    public boolean hasNext(){
        if (this.index == this.list.size()-1){
            return false;
        }else {
            return true;
        }
    }

    public void print() throws Exception {
        if (this.list.size() == 0){
            throw new IndexOutOfBoundsException("Invalid Operation!\".");
        }else {
            System.out.println(this.list.get(this.index));
        }
    }


    @Override
    public Iterator<String> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<String>{

        int index = 0;
        @Override
        public boolean hasNext() {
            if (this.index < list.size() -1){
                return true;
            }else {
                return false;
            }

        }

        @Override
        public String next() {
            String result = list.get(index);
            index++;
            return result;
        }
    }
    public void printAll(){
      if (this.list.isEmpty()){
          System.out.println("Invalid Operation");
          return;
      }else {
          this.list.forEach(element -> System.out.print(element+" "));
          System.out.println();
      }
    }
}
