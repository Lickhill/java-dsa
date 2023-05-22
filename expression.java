import java.util.*;

public class expression {
    static String expn;

    expression() {
        expn = "";
    }

    static void inputexp(String ex) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression");
        expn = sc.nextLine();
        ex = expn;

    }

    static long getfinalval() {
        int sum = 0;
        inputexp(expn);
        int i;
        for (i = 0; i < expn.length(); i++) {
            char ch = expn.charAt(i);
            if (ch == '*' || ch == '/' || ch == '-' || ch == '+') {
                String f = expn.substring(0, i);
                String h = expn.substring(i + 1, expn.length());
                int a = Integer.parseInt(f);
                int b = Integer.parseInt(h);
                if (ch == '*')
                    sum = a * b;
                else if (ch == '/')
                    sum = a / b;
                else if (ch == '+')
                    sum = a + b;
                else
                    sum = a - b;

            }

        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println("the ans is " + getfinalval());
    }
}
