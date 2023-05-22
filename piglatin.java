import java.util.*;

public class piglatin {
    String str, newstr;
    int len;

    piglatin() {
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

    void convert() {
        int i;
        for (i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                newstr = str.substring(i, len) + str.substring(0, i) + "AY";
                break;
            }
        }
    }

    void display() {
        System.out.println("The ori word is: " + str);
        convert();
        System.out.println("the new word is: " + newstr);
    }

    public static void main(String args[]) {
        piglatin obj = new piglatin();
        obj.readword();
        obj.display();
    }
}
