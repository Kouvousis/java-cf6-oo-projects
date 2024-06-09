package gr.aueb.cf.ch14;

public class StackManager {
    private static StackManager instance = null;
    private static final int MAX_SIZE = 10;
    private static String[] stack;
    private static int top;

    private StackManager() {
        stack = new String[MAX_SIZE];
        top = -1;
    }

    public static StackManager getInstance() {
        if (instance == null){
            instance = new StackManager();
        }
        return instance;
    }

    public static void push(String str) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = str;
    }

    public static void pop(String str) {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        stack[top--] = str;
    }

    private static boolean isFull() {
        return getInstance().top == MAX_SIZE - 1;
    }

    private static boolean isEmpty(){
        return getInstance().top == -1;
    }


}
