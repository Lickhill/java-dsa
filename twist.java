import java.util.*;

public class twist {
    String wrd, res;

    twist() {
        wrd = res = "";
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        wrd = sc.nextLine();
        wrd = wrd.toUpperCase();
    }

    void twistt() {
        int i = 0;

        while (i < wrd.length() - 1) {
            int j = i + 1;
            char ch = wrd.charAt(i);
            while (j < wrd.length()) {
                char ch1 = wrd.charAt(j);
                res = res + ch1 + ch;
                i = i + 2;
                break;

            }
        }
        if (wrd.length() % 2 != 0)
            res = res + wrd.charAt(wrd.length() - 1);

    }

    void display() {
        System.out.println("The ori word is: " + wrd);
        twistt();
        System.out.println("The new word is: " + res);
    }

    public static void main(String args[]) {
        twist obj = new twist();
        obj.accept();
        obj.display();
    }

}