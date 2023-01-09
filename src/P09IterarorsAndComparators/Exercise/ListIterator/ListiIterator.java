package P09IterarorsAndComparators.Exercise.ListIterator;

import java.util.List;

public class ListiIterator {
    private List<String> list;

    public ListiIterator(List<String> list) {
        this.list = list;
    }


    //•	Move - should move an internal index position to the next index in the list, the method should return true
    // if it successfully moved and false if there is no next index.

    //•	HasNext - should return true if there is a next index and false if the index is already at the last element of the list.

    //•	Print - should print the element at the current internal index,
    // calling Print on a collection without elements should throw an appropriate exception with the message "Invalid Operation!".

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
