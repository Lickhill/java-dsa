import java.util.*;

public class prime {
    int num;

    prime() {
        num = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
    }

    int count = 0;
    int j = 2;

    int prime2(int x) {
        if (j == x && count == 0) {
            j = 2;
            count = 0;
            return 1;
        } else if (x == j && count > 0) {
            j = 2;
            count = 0;
            return 0;
        } else {
            if (x % j == 0)
                count++;
            j = j + 1;
            return prime2(x);
        }
    }

    void display() {
        if (prime2(num) == 1)
            System.out.println("yes the number is prime");
        else
            System.out.println("no the number is not prime");
    }

    public static void main(String args[]) {
        prime obj = new prime();
        obj.accept();
        obj.display();
    }
}
