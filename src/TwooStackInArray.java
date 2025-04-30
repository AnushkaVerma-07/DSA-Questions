import java.util.*;
public class TwooStackInArray {
    int size;
    int[]arr;
    int top1, top2;

    public TwooStackInArray(int n){
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    public void push1(int x){
        if (top1+1 < top2){
            top1++;
            arr[top1] = x;
        }
        else{
            System.out.println("Stack overflow");
        }
    }

    public void push2(int x) {
        if (top1 + 1 < top2) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow for Stack 2");
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow for Stack 1");
            return -1;
        }
    }

    public int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Underflow for Stack 2");
            return -1;
        }
    }


    public static void main(String[] args) {
        TwooStackInArray ts = new TwooStackInArray(10);

        ts.push1(1);
        ts.push1(2);
        ts.push1(3);

        ts.push2(10);
        ts.push2(9);
        ts.push2(8);

        System.out.println("Popped from Stack 1: " + ts.pop1());
        System.out.println("Popped from Stack 2: " + ts.pop2());
    }
}
