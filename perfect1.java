import java.util.*;

public class perfect1 {
    int num, sum;

    perfect1() {
        num = sum = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper range");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
    }

    int i = 1;

    int factorsum(int a) {
        if (i == a) {
            return sum;
        } else {
            if (a % i == 0)
                sum = sum + i;
            i = i + 1;
            return factorsum(a);
        }
    }

    void display() {
        for (int j = 1; j <= num; j++) {
            sum = 0;
            i = 1;
            factorsum(j);
            if (sum == j)
                System.out.println(j);
        }
    }

    public static void main(String args[]) {
        perfect1 obj = new perfect1();
        obj.accept();
        obj.display();
    }

}
