import java.util.*;
import java.util.StringTokenizer;

public class insert {
    String sent, word, f;
    int n;

    insert() {
        sent = word = "";
        n = 0;
        f = "";
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        sent = sc.nextLine();
        System.out.println("Enter a word to be inserted");
        word = sc.nextLine();
        System.out.println("enter the position of the word");
        n = sc.nextInt();
    }

    void insertion() {
        StringTokenizer st = new StringTokenizer(sent, " .,?!");

        int x = st.countTokens();
        if (n > x + 2) {
            System.out.println("INVALID POSITION");
            System.exit(0);
        }
        int i = 0;

        while (st.hasMoreTokens()) {
            i = i + 1;
            String wrd = st.nextToken();
            if (i == n) {
                f = f + word + " ";
            }
            f = f + wrd + " ";

        }
        i = i + 1;
        if (i == n) {
            f = f + word + " ";
        }
    }

    void display() {
        insertion();
        System.out.println("The new sentence is: " + f);
    }

    public static void main(String args[]) {
        insert obj = new insert();
        obj.accept();
        obj.display();
    }
}