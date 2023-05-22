import java.util.*;

public class twist2 {
    String wrd, res;

    twist2() {
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
        int j = i + 1;
        while (i < wrd.length() - 1) {
            res = res + wrd.charAt(j) + wrd.charAt(i);
            i = i + 2;
            j = i + 1;
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
        twist2 obj = new twist2();
        obj.accept();
        obj.display();
    }

}