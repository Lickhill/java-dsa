import java.util.*;

public class capsmall {
    String str;
    int cap, sm;

    capsmall() {
        str = "";
        cap = sm = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        str = sc.nextLine();
    }

    void recursion(int len) {

        if (len >= 0) {
            char ch = str.charAt(len);
            if (ch >= 'A' && ch <= 'Z')
                cap++;
            else
                sm++;
            recursion(len - 1);
        }
    }

    void display() {
        int bbr = str.length();
        recursion(bbr - 1);
        System.out.println("The Sentence is:" + str);
        System.out.println("The cap is:" + cap);
        System.out.println("The small  is:" + sm);
    }

    public static void main(String args[]) {
        capsmall obj = new capsmall();
        obj.accept();
        obj.display();
    }
}
