package entities;

public class StackTad<T> implements ContractStack<T> {

    private final int MAX_CAPACITY = 10;
    private int last_position = -1;
    private Object[] stack;

    public StackTad() {
        stack = new Object[MAX_CAPACITY];
    }

    @Override
    public T pop() {
        last_position--;
        return (T) this.stack[this.last_position];
    }

    @Override
    public T push(Object object) {
        if (last_position < MAX_CAPACITY - 1) {
            last_position++;
            this.stack[last_position] = object;
        }
        return null;
    }

    @Override
    public T top() {
        return (!this.isEmpty()) ? (T) stack[last_position] : null;
    }

    @Override
    public Boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Integer size() {
        return last_position + 1;
    }

    @Override
    public void clear() {
        stack = new Object[MAX_CAPACITY];
    }
}
