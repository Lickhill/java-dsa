import java.util.*;

public class yash {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String str = sc.nextLine();

        str = str.trim();
        int i;
        int len = str.length();
        String f = "";
        for (i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == '.' || ch == ',') {
            } else
                f = f + ch;
        }

        System.out.println("the name is: " + f);

    }
}