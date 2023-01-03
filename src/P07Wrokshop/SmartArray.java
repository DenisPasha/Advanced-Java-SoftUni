package P07Wrokshop;

import java.util.function.Consumer;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;

  private int[] data;
  private   int size;

    public int getSize() {
        return size;
    }

    private int capacity;

    public SmartArray() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    public void forEach(Consumer<Integer>consumer){
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }

    public void add(int index, int element){
      if (validateIndex(index)){
          this.size++;
         if (capacityCheck(this.size, this.capacity)){
             grow();
         }

          if (this.size - 1 - index >= 0)
              System.arraycopy(this.data, index, this.data, index + 1, this.size - 1 - index);
          this.data[index] = element;
      }else {
          throw new IndexOutOfBoundsException("Index ou of Bounds for SmartArray!");
      }
    }

    private boolean capacityCheck(int size, int capacity) {
        return size == capacity;
    }

    public void add(int element){
       if (capacityCheck(size, capacity)){
           grow();
       }
        this.data[size] = element;
        size++;

    }

    public int get(int index){

       if (validateIndex(index)){
           return this.data[index];
       }else {
           throw new IndexOutOfBoundsException("SmartArray index out of bounds");
       }

    }

    public int remove(int index){

      int elementToReturn = get(index);
        shiftLeft(index);
        return elementToReturn;
    }

    private void shiftLeft(int index) {

        if (this.size - 1 - index >= 0) System.arraycopy(this.data, index + 1, this.data, index, this.size - 1 - index);
        this.data[size-1] = 0;
        this.size --;
        if (this.capacity / 4 > this.size){
            shrinkSmartArray();
        }
    }

    private void shrinkSmartArray() {
        this.capacity = this.capacity / 2;
        int[] temp = new int[this.capacity];

        System.arraycopy(this.data, 0, temp, 0, this.capacity);
        System.out.println();
        this.data = new int[this.capacity];
        this.data = temp;
    }

    private boolean validateIndex(int index) {
        return index >= 0 && index < this.size;
    }

    private void grow() {
        capacity = capacity * 2;
        int[] temp = this.data;

        this.data = new int[capacity];
        System.arraycopy(temp, 0, this.data, 0, temp.length);

    }
}
