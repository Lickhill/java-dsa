class Stack_ {
    int st[];
    int size;
    int top;

    Stack_(int n) {
        size = n;
        st = new int[size];
        top = 0;
    }

    void push(int n) {
        if (top + 1 < size)
            st[++top] = n;
        else
            System.out.println("Stack is full");
    }

    int pop() {
        if (top >= 0)
            return st[top--];
        else
            return -9999;
    }

    void display() {
        if (top < 0) {
            System.out.println("The Stack Is Empty:");
        } else {
            System.out.println("The elements in the stack are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(st[i]);
            }
        }
    }
}
