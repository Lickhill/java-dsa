import java.util.*;

public class words {
    String text;
    int w;

    words() {
        text = "";
        w = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text");
        text = sc.nextLine();
        text = text.trim();
        text = text + " ";
    }

    int findword(int q) {
        if (q == 0)
            return w;
        else {
            if (text.charAt(q) == ' ' && text.charAt(q - 1) != ' ') {
                w = w + 1;
            }
        }
        return findword(q - 1);
    }

    void result() {
        accept();
        System.out.println("The original text is:\n" + text);
        findword(text.length() - 1);
        System.out.println("The number of words are: " + w);
    }

    public static void main(String args[]) {
        words obj = new words();
        obj.result();

    }

}