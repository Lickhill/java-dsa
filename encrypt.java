import java.util.*;

public class encrypt {
    String str, newstr;
    int len;

    encrypt() {
        str = newstr = "";
        len = 0;
    }

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        str = sc.nextLine();
        str = str.toUpperCase();
        len = str.length();
    }

    void Encrypt() {
        int i;
        for (i = 0; i < len; i++) {
            char ch = str.charAt(i);
            newstr = newstr + (char) (int) (ch + (i + 1));
        }
    }

    void display() {
        System.out.println("the ori word: " + str);
        Encrypt();
        System.out.println("The new word: " + newstr);
    }

    public static void main(String args[]) {
        encrypt obj = new encrypt();
        obj.readword();
        obj.display();

    }

}