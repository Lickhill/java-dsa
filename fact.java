import java.util.*;

public class fact {
    int n, f;

    fact() {
        n = 0;
    }

    int factorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        else
            return num * factorial(num - 1);
    }

    void getfactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        f = factorial(n);
        System.out.println("factorial is " + f);
    }

    public static void main(String args[]) {
        fact obj = new fact();
        obj.getfactorial();
    }
}
