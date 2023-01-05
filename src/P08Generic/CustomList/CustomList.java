package P08Generic.CustomList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T> > {

    private List<T> list;

    public CustomList (){
        this.list = new ArrayList<>();
    }

    public void sort(){
        this.list.sort((e1,e2)-> e1.compareTo(e2));

    }

    public 	void add(T element){
        this.list.add(element);
        }

    public 	T remove(int index){
        return this.list.remove(index);
    }

    public boolean contains(T element){
        return this.list.contains(element);
    }
    public 	void swap(int indexOne, int indexTwo){
        T elementOne = this.list.get(indexOne);
        T elementTwo = this.list.get(indexTwo);

        this.list.set(indexOne , elementTwo);
        this.list.set(indexTwo , elementOne);
    }

    public 	int countGreaterThan(T element) {
        int countGreaterThan = 0;
        for (T elementFromList : this.list) {
           if(elementFromList.compareTo(element) > 0) {
                countGreaterThan++;
            }
        }
        return countGreaterThan;
    }
    public T getMax(){
      return this.list.stream().max(Comparable::compareTo).get();
    }
    public T getMin(){
       return this.list.stream().min(Comparable::compareTo).get();
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        this.list.forEach(el -> stringBuilder.append(el).append(System.lineSeparator()));
        return stringBuilder.toString();
    }
}
