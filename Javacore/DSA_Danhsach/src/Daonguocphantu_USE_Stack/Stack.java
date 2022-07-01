package Daonguocphantu_USE_Stack;

public class Stack {
    int size;
    char[] a;
    int top;

    boolean isEmpty() {
        return (top < 0);
    }

    Stack(int n) {
        top = -1;
        size = n;
        a = new char[size];
    }

    boolean push(char x) {
        if (top >= size) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    char pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            char x = a[top--];
            return x;
        }
    }
}



