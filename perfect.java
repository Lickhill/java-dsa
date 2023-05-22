import java.util.*;

public class perfect {
    int num, sum;

    perfect() {
        num = sum = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
    }

    int i = 1;

    int factorsum(int a) {
        if (i == a)
            return sum;
        else {
            if (a % i == 0)
                sum = sum + i;
            i = i + 1;
            return factorsum(a);
        }
    }

    void display() {
        factorsum(num);
        if (sum == num)
            System.out.println("yes");
        else
            System.out.println("no");
    }

    public static void main(String args[]) {
        perfect obj = new perfect();
        obj.accept();
        obj.display();
    }

}
