import java.util.*;

public class sortword {
    String wrd, newwrd;
    int len;

    String f = "";

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        wrd = sc.nextLine();
        f = wrd;
        wrd = wrd.toUpperCase();
        len = wrd.length();
    }

    void arrange() {
        int i;
        char ch;
        newwrd = "";
        for (ch = 'A'; ch <= 'Z'; ch++) {
            for (i = 0; i < len; i++) {
                char ch1 = wrd.charAt(i);
                if (ch == ch1)
                    newwrd = newwrd + ch1;
            }
        }
    }

    void show() {
        System.out.println("The orig word " + f);
        arrange();
        System.out.println("The new word " + newwrd);
    }

    public static void main(String args[]) {
        sortword obj = new sortword();
        obj.readword();
        obj.show();
    }
}