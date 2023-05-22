import java.util.*;

public class evenseries {
    long n;
    float s;
    float k;

    evenseries() {
        n = 0;
        s = k = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of s between 2.0 to 7.0");
        s = sc.nextFloat();
        if (s <= 2.0 || s >= 7.0) {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
    }

    long fact(long x) {
        if (x == 0 || x == 1)
            return 1;
        else
            return x * fact(x - 1);
    }

    void display() {
        n = 1;
        while (n > 1) {
            k = k + (float) ((float) Math.pow(2, n) / (float) fact(n));
            if (k >= s)
                break;
            n = n + 1;
        }

        System.out.println("The least value of n is: " + n);
    }

    public static void main(String args[]) {
        evenseries obj = new evenseries();
        obj.accept();
        obj.display();
    }

}