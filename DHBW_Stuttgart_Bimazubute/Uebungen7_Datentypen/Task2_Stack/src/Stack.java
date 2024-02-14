import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public T push(T item) {
        stack.add(item);
        return item;
    }

    public T pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = stack.remove(stack.size() - 1);
        return item;
    }

    public T peek() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }
}