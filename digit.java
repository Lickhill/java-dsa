import java.util.*;

public class digit {
    int num, digit;

    digit() {
        num = digit = 0;
    }

    String f = "";

    void accept()

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        f = Integer.toString(num);
    }

    void max_digit() {
        int i, j;
        int sum = 0;
        for (i = 0; i < f.length() - 1; i++) {
            int count = 0;
            char ch1 = f.charAt(i);
            for (j = i + 1; j < f.length(); j++) {
                char ch2 = f.charAt(j);

                if (ch1 == ch2)
                    count = count + 1;
            }
            if (count >= sum) {
                sum = count;
                digit = ch1 - '0';
            }
        }
    }

    void display() {
        System.out.println("The original number is " + num);
        max_digit();
        System.out.println("The max digit is " + digit);
    }

    public static void main(String args[]) {
        digit obj = new digit();
        obj.accept();
        obj.display();
    }
}