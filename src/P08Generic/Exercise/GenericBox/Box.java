package P08Generic.Exercise.GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Comparable<T> > {

    private List<T> myList ;

    public Box(){
        this.myList = new ArrayList<>();
    }

    public void add(T element){
        this.myList.add(element);
    }
@Override
    public String toString(){
      StringBuilder sb = new StringBuilder();
    for (int i = 0; i < this.myList.size(); i++) {
        sb.append(this.myList.get(i).getClass().getName()).append(": ");
        sb.append(this.myList.get(i));
        sb.append(System.lineSeparator());
    }
    return sb.toString();
    }


    public void swap(int indexOne , int indexTwo){
        T firstIndexElement = this.myList.get(indexOne);
        T secondIndexElement = this.myList.get(indexTwo);

        this.myList.set(indexOne,secondIndexElement);
        this.myList.set(indexTwo,firstIndexElement);
    }

    public int returnCount(T element){
        int returnCount = 0;

        for (int i = 0; i < this.myList.size(); i++) {
            T currentElement = this.myList.get(i);
            if (currentElement.compareTo(element) > 0){
                returnCount++;
            }
        }
        return returnCount;
    }
}
