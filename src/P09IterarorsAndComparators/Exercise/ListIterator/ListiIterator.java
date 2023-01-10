package P09IterarorsAndComparators.Exercise.ListIterator;

import java.util.List;

public class ListiIterator {
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


}
