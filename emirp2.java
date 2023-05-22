import java.util.*;

public class emirp2 {
    int n, rev, f;

    emirp2(int nn) {
        n = nn;
        rev = 0;
        f = 2;
    }

    int count = 0;

    int isprime(int x) {
        if (f >= x && count > 0) {
            f = 2;
            count = 0;
            return 0;

        } else if (f >= x && count == 0) {
            f = 2;
            count = 0;
            return 1;
        } else {
            if (x % f == 0) {
                count = count + 1;
            }
            f = f + 1;
            return isprime(x);
        }
    }

    void isemirp() {
        int num = n;
        while (n > 0) {
            int d = n % 10;
            rev = (rev * 10) + d;
            n = n / 10;
        }
        System.out.println(rev + "\t" + num);
        System.out.println(isprime(rev) + "\t" + isprime(num));
        if (isprime(rev) == 1 && isprime(num) == 1)
            System.out.println("yes nigga");
        else
            System.out.println("no nigga");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int q = sc.nextInt();
        emirp2 obj = new emirp2(q);
        obj.isemirp();
    }
}