import java.util.*;

public class unique {
    String str;
    int len;

    unique() {
        str = "";
        len = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        str = sc.nextLine();
        str = str.toUpperCase();
        len = str.length();
    }

    int count = 0;

    void check() {
        int i, j;
        for (i = 0; i < len - 1; i++) {
            char ch = str.charAt(i);
            for (j = i + 1; j < len; j++) {
                char ch1 = str.charAt(j);

                if (ch == ch1)
                    count++;
            }
        }
    }

    void display() {
        System.out.println("The ori word is " + str);
        check();
        if (count == 0)
            System.out.println("The word is a unique word");
        else
            System.out.println("The word is not a unique worrd");
    }

    public static void main(String args[]) {
        unique obj = new unique();
        obj.accept();
        obj.display();
    }
}