import java.util.*;

public class change {
    String str, newstr;
    int len;

    change() {
        str = newstr = "";
        len = 0;
    }

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        str = sc.nextLine();
        len = str.length();
    }

    void swap() {
        int i;
        char ch;
        for (i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
                ch = (char) (int) (ch + 1);
            else
                ch = (char) (int) (ch - 1);
            newstr = newstr + ch;
        }
    }

    void display() {
        System.out.println("The ori word is: " + str);
        swap();
        System.out.println("The new word is: " + newstr);
    }

    public static void main(String args[]) {
        change obj = new change();
        obj.readword();
        obj.display();
    }
}
