import java.util.*;

public class newseries {
    int x, n;
    double sum;

    newseries() {
        x = n = 0;
        sum = 0.0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value and x and n");
        x = sc.nextInt();
        n = sc.nextInt();
    }

    int sum(int a) {
        if (a <= 1)
            return 1;
        else
            return a + sum(a - 1);
    }

    void display() {
        for (int j = 1; j <= n; j++) {
            sum = (double) sum + (double) ((x * j) / sum(j));
        }
        System.out.println("the sum is: " + sum);
    }

    public static void main(String args[]) {
        newseries obj = new newseries();
        obj.accept();
        obj.display();
    }
}