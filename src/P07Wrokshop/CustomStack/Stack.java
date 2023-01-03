package P07Wrokshop.CustomStack;

public class Stack {

    private static final int INITIAL_CAPACITY = 4;
    private static final int INITIAL_SIZE = 0;

    int[] data;
    int size;
    int capacity;

    public Stack(){
        this.capacity = INITIAL_CAPACITY;
        this.data = new int[this.capacity];
        this.size = INITIAL_SIZE;

    }

    public int peek(){
       return this.data[this.size-1];
    }


    public int pop(){
        int lastElement = this.data[this.size-1];
        this.data[this.size] = 0;
        this.size--;

        shrink();

        return lastElement;
    }

    private void shrink() {
        if (this.capacity / 4 > this.size){
            this.capacity = this.capacity / 2;
            int[] temp = new int[this.capacity];
            if (this.size >= 0) System.arraycopy(this.data, 0, temp, 0, this.size);
            this.data = new int[this.capacity];
            if (this.size >= 0) System.arraycopy(temp, 0, this.data, 0, this.size);

        }
    }

    public void add(int element){
       if (capacityCheck()){
           grow();
       }

        this.data[size] = element;
        this.size++;
    }

    private boolean capacityCheck() {
        return this.capacity == this.size;
    }

    private void grow() {
        this.capacity = this.capacity * 2;
        int [] temp = new int[this.size];
        System.arraycopy(this.data, 0, temp, 0, this.size);
        this.data = new int[this.capacity];
        if (this.size >= 0) System.arraycopy(temp, 0, this.data, 0, this.size);

    }
}
