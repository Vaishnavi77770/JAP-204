import java.util.ArrayList;

interface StackOperations {
    void push(int item);
    int pop();
    void display();
}

class FixedStack implements StackOperations {
    private int[] stack;
    private int top;

    public FixedStack(int size) {
        stack = new int[size];
        top = -1;
    }

    @Override
    public void push(int item) {
        if (top == stack.length - 1) {
            System.out.println("FixedStack is full. Cannot push " + item);
        } else {
            stack[++top] = item;
        }
    }

    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("FixedStack is empty. Cannot pop.");
            return -1;
        } else {
            return stack[top--];
        }
    }

    @Override
    public void display() {
        if (top == -1) {
            System.out.println("FixedStack is empty.");
        } else {
            System.out.print("FixedStack contents: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

class DynamicStack implements StackOperations {
    private ArrayList<Integer> stack;
    private int capacity;

    public DynamicStack(int initialCapacity) {
        capacity = initialCapacity;
        stack = new ArrayList<>(capacity);
    }

    private void resize() {
        capacity *= 2;
        ArrayList<Integer> newStack = new ArrayList<>(capacity);
        newStack.addAll(stack);
        stack = newStack;
        System.out.println("DynamicStack resized to capacity " + capacity);
    }

    @Override
    public void push(int item) {
        if (stack.size() == capacity) {
            resize();
        }
        stack.add(item);
    }

    @Override
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("DynamicStack is empty. Cannot pop.");
            return -1;
        } else {
            return stack.remove(stack.size() - 1);
        }
    }

    @Override
    public void display() {
        if (stack.isEmpty()) {
            System.out.println("DynamicStack is empty.");
        } else {
            System.out.print("DynamicStack contents: ");
            for (int item : stack) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        StackOperations stack;

        stack = new FixedStack(3);
        System.out.println("-- FixedStack --");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        System.out.println("Pop: " + stack.pop());
        stack.display();

        System.out.println();

        stack = new DynamicStack(2);
        System.out.println("-- DynamicStack --");
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.display();
        System.out.println("Pop: " + stack.pop());
        stack.display();
    }
}
