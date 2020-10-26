package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        // homework
        size = capacity;
        data = (T[]) (new Object [capacity]);
    }

    @Override
    public boolean push(T val) {
        // homework
        if(size() == size) {
            return false;   // place holder
        }

        data[size] = val;

        return true;
    }

    @Override
    public T pop() {
        // homework
        T val;   // place holder
        if(size < 0){
            return null;
        }
        val = data[size];
        return val;   // place holder
    }

    @Override
    public T peek() {
        // homework
        T val;   // place holder
        if(size < 0){
            return null;
        }
        val = data[size];
        data[size--] = null;
        return val;   // place holder
    }

    @Override
    public int size() {
        return size;
    }
}
