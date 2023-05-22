import java.util.*;

public class decbin {
    int n, i, s;

    decbin() {
        n = s = 0;
        i = 1;
    }

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimel number:");
        n = sc.nextInt();
    }

    void recursion(int f) {
        if (f > 0) {
            int d = f % 2;
            s = s + (i * d);
            i = i * 10;
            recursion(f / 2);
        }

    }

    void putdata() {
        getdata();
        System.out.println("The dec number is:" + n);
        recursion(n);
        System.out.println("The binary number is:" + s);

    }

    public static void main(String args[]) {
        decbin obj = new decbin();
        obj.putdata();

    }
}