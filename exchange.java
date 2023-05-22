import java.util.*;

public class exchange {
    String sent;
    String newsent;
    int len;

    exchange() {
        sent = newsent = "";
        len = 0;
    }

    void readsentence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence with words separated by one gap and terminated by a fullstop(.)");
        sent = sc.nextLine();
        len = sent.length();

    }

    void newword() {
        String f = "";
        int i;

        for (i = 0; i < len; i++) {
            char ch = sent.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
                f = f + ch;
            else if (ch == ' ' || ch == '.') {
            } else
                newsent = newsent + ch;

        }
        newsent = newsent + f + ".";
    }

    void display() {
        System.out.println("The orig word " + sent);
        newword();
        System.out.println("The new word is: " + newsent);
    }

    public static void main(String args[]) {
        exchange obj = new exchange();
        obj.readsentence();
        obj.display();

    }
}