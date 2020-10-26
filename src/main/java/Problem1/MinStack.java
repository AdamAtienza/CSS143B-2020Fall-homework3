package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack

    private ArrayStack<Integer> p1; // = new ArrayStack<>();
    private int count;

    public MinStack(int size) {
        // homework

        super(size); // place holder
    }

    @Override
    public boolean push(Integer val) {
        // homework
        if (val <= getMin()) {
            p1.push(val);
        }
        return super.push(val);
    }

    @Override
    public Integer pop() {
        // homework
        int val = super.pop();
        if (val == getMin()) {
            p1 .pop();
        }
        return val;
    }

    public Integer getMin() {
        // homework
        // loop of any kind is not allowed
        if (p1.size() < 0) {
            return Integer.MAX_VALUE;
        } else {
            return p1.peek();
        }
    }
}

