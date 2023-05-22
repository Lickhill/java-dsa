import java.util.*;

public class rearrange {
    String txt, cxt;
    int len;

    rearrange() {
        txt = "";
        cxt = "";
        len = 0;
    }

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        txt = sc.nextLine();
        len = txt.length();
        txt = txt.trim();
        txt = txt.toUpperCase();

    }

    void convert() {
        int i;
        char ch, ch1;
        ch = txt.charAt(0);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            cxt = txt + "Y";
            return;
        }

        for (i = 1; i < len; i++) {
            ch1 = txt.charAt(i);
            if (ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') {
                cxt = txt.substring(i, len) + txt.substring(0, i) + "C";
                return;
            }

        }
        cxt = txt + "N";
    }

    void display() {
        System.out.println("Th original word is " + txt);
        convert();
        System.out.println("The new word is: " + cxt);
    }

    public static void main(String args[]) {
        rearrange obj = new rearrange();
        obj.readword();
        obj.display();
    }
}