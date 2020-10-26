package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        // homework
        data = new LinkedList<T>();

    }

    @Override
    public boolean push(T val) {
        // homework
        data.add(val);
        return true;   // place holder
    }

    @Override
    public T pop() {
        // homework
        T val; // place holder
        if(data.isEmpty()){
            return null;
        }
        val = data.removeLast();
        return val;   // place holder
    }

    @Override
    public T peek() {
        // homework
        T val;// place holder
        if(data.isEmpty()){
            return null;
        }
        val = data.getLast();
        return val;   // place holder
    }

    @Override
    public int size() {
        return data.size();
    }
}
