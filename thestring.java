import java.util.*;

public class thestring {
    String str;
    int len;

    thestring() {
        str = "";
        len = 0;
    }

    thestring(String ds) {
        str = ds;
    }

    void printfreq() {
        System.out.println("Alphabet\tFrequency");
        str = str.toUpperCase();
        len = str.length();
        int i;
        int count;
        char ch;
        for (ch = 'A'; ch <= 'Z'; ch++) {
            count = 0;
            for (i = 0; i < len; i++) {
                char ch1 = str.charAt(i);
                if (ch == ch1) {
                    count = count + 1;
                }
            }
            if (count > 0)
                System.out.println(ch + "\t\t" + count);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String x = sc.nextLine();
        thestring obj = new thestring(x);
        obj.printfreq();
    }
}