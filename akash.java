import java.util.*;

public class akash {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int i;
        char ch;
        int count = 0;
        System.out.println("Alphabet\tFrequency");
        for (ch = 'a'; ch <= 'z'; ch++) {
            for (i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i))
                    count++;
            }
            if (count > 0)
                System.out.println(ch + "\t\t" + count);
            count = 0;
        }
    }
}