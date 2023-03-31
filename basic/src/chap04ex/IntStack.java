package chap04ex;

public class IntStack {

    private int[] stack;
    private int capacity;
    private int pointer;

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException(){}
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException(){}
    }

    public IntStack(int maxlen) {
        pointer = 0;
        capacity = maxlen;
        try {
            stack = new int[capacity];
        } catch (OutOfMemoryError error) {
            capacity = 0;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int push(int x) throws OverflowIntStackException {
        if (pointer >= capacity) {
            throw new OverflowIntStackException();
        }
            return stack[pointer++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if (pointer <= 0) {
            throw new EmptyIntStackException();
        }
        return stack[--pointer];
    }

    public int peek() throws EmptyIntStackException {
        if (pointer <= 0) {
            throw new EmptyIntStackException();
        }
        return stack[pointer - 1];
    }

    public void clear() {
        pointer = 0;
    }

    public int indexOf(int x) {
        for (int i = pointer - 1; i > 0; i--) {
            if (stack[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return capacity;
    }

    public boolean isEmpty() {
        return pointer <= 0;
    }

    public boolean isFull() {
        return pointer >= capacity;
    }

    public void dump() {
        if (pointer <= 0) {
            System.out.println("스택 비어있음");
        }
        for (int i = 0; i < pointer; i++) {
            System.out.println(stack[i]);
        }
    }

}
