import java.util.*;

public class doubt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Etner a word");
        String word = sc.nextLine();
        word = word.toUpperCase();
        int i;
        int f;
        int sum = 0;
        for (i = 0; i < word.length(); i++) {
            f = 0;
            char ch = word.charAt(i);
            f = ch - 64;
            System.out.print(ch + "\t" + f + "\n");
            sum = sum + f;
        }
        System.out.println("The potential of the word " + word + " is: " + sum);
    }
}