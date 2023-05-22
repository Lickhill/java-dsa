import java.util.*;

public class octadeci {
    int n, dec;

    octadeci() {
        n = dec = 0;
    }

    void getoctal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an octal number");
        n = sc.nextInt();

    }

    int i = -1;

    int recursivedec(int q) {
        i = i + 1;
        if (q <= 0)
            return dec;
        else {
            int d = q % 10;
            dec = dec + (d * (int) Math.pow(8, i));
            return recursivedec(q / 10);
        }
    }

    void putdata() {
        System.out.println("The octal no " + n);
        recursivedec(n);
        System.out.println("THe dec no. " + dec);
    }

    public static void main(String args[]) {
        octadeci obj = new octadeci();
        obj.getoctal();
        obj.putdata();
    }

}
