import java.util.*;

public class wordsum {
    String wrd;
    int len;

    wordsum() {
        wrd = "";
        len = 0;
    }

    void acceptword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word");
        wrd = sc.nextLine();
        wrd = wrd.toUpperCase();
        len = wrd.length();
    }

    int sum = 0;

    int sumascii() {
        for (int i = 0; i < len; i++) {
            char ch = wrd.charAt(i);
            sum = sum + (int) ch;
        }
        return sum;
    }

    void display() {
        System.out.println("The ori word is: " + wrd);
        sumascii();
        System.out.println("the ascii sum is: " + sum);
    }

    public static void main(String args[])

    {
        wordsum obj = new wordsum();
        obj.acceptword();
        obj.display();
    }
}