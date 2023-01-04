package P08Generic.lab.GenericScale;

public class GenericScale<T extends Comparable<T>>  {
    private T left;
    private T right;

    public GenericScale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){
        if (left.compareTo(right)==0){
            return null;
        }
        if (left.compareTo(right) > 0){
            return left;
        }
        return right;
    }

}
