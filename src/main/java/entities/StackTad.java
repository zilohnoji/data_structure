package entities;

public class StackTad<T> implements ContractStack<T> {

    private final int MAX_CAPACITY = 10;
    private int last_position = -1;
    private Object[] stack;

    public StackTad() {
        stack = (T[]) new Object[MAX_CAPACITY];
    }

    @Override
    public T pop() {
        if (this.size() != 0) {
            last_position--;
            return (T) this.stack[this.last_position];
        }
        return null;
    }

    @Override
    public T push(Object object) {
        if (last_position < MAX_CAPACITY - 1) {
            last_position++;
            this.stack[last_position] = object;
        }
        return (T) this.stack[last_position];
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
        last_position = -1;
        stack = new Object[MAX_CAPACITY];
    }
}
