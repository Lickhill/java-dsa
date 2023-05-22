import java.util.*;

public class check {
    String wrd;
    int len;

    check() {
        wrd = "";
        len = 0;
    }

    void acceptword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        wrd = sc.nextLine();
        wrd = wrd.trim();
        wrd = wrd.toUpperCase();
        len = wrd.length();
    }

    int count = 0;

    boolean checkVowel() {
        acceptword();
        char ch = wrd.charAt(0);
        char ch1 = wrd.charAt(len - 1);
        if (ch == 'A' && ch == ch1 || ch == 'E' && ch == ch1 || ch == 'O' && ch == ch1 || ch == 'I' && ch == ch1
                || ch == 'U' && ch == ch1)
            return true;
        else
            return false;
    }

    void display() {
        if (checkVowel() == true)
            System.out.println("yes");
        else
            System.out.println("no");
    }

    public static void main(String args[]) {
        check obj = new check();
        obj.display();
    }

}