import java.util.*;

public class primesum {
    int N, sum;

    primesum() {
        N = 0;
        sum = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth value");
        N = sc.nextInt();
    }

    int count = 0;
    int j = 1;

    int prime(int n, int a) {
        if (n == a && count == 0) {
            count = 0;
            return n;
        } else if (n == a && count > 0) {
            count = 0;
            return 0;
        } else {
            if (n % a == 0)
                count++;
            return prime(n, ++a);
        }
    }

    void display() {

        while (N > 0) {
            j = j + 1;
            if (prime(j, 2) > 0) {
                N = N - 1;
            }
            sum = sum + prime(j, 2);

        }

        System.out.println("Sum is: " + sum);
    }

    public static void main(String args[]) {
        primesum obj = new primesum();
        obj.accept();
        obj.display();
    }
}
