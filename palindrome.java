import java.util.*;

public class palindrome {
    String str, newstr;
    int len;

    palindrome() {
        str = newstr = "";
        len = 0;
    }

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        str = sc.nextLine();
        len = str.length();
        str = str.toUpperCase();
    }

    String f = "";

    boolean checkpalindrome(String s) {
        for (int i = len - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            f = f + ch;
        }
        if (f.equalsIgnoreCase(str))
            return true;
        else
            return false;
    }

    void getPalindrome() {
        if (checkpalindrome(str) == false) {
            newstr = str + f.substring(1, len);
        }
    }

    void display() {
        System.out.println("THe orig word is: " + str);
        getPalindrome();
        if (checkpalindrome(str) == false) {
            System.out.println("The new word is: " + newstr);
        }
    }

    public static void main(String args[]) {
        palindrome obj = new palindrome();
        obj.readword();
        obj.display();

    }
}