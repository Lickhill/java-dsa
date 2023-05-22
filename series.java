import java.util.*;

public class series {
    int x, n;
    double sum;

    series() {
        x = n = 0;
        sum = 0.0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        x = sc.nextInt();
        System.out.println("Enter the value of n");
        n = sc.nextInt();
    }

    int factorial(int a) {
        if (a <= 0)
            return 1;
        else
            return a * factorial(a - 1);

    }

    void display() {
        for (int i = 1; i <= n; i++) {
            sum = sum + ((int) Math.pow(x, i) / factorial(i));
        }
        System.out.println("the sum is: " + sum);
    }

    public static void main(String args[]) {
        series obj = new series();
        obj.accept();
        obj.display();
    }

}