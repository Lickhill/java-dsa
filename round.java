import java.util.*;

public class round {
    String wrd, res;

    round() {
        wrd = res = "";
    }

    void acceptword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        wrd = sc.nextLine();
        wrd = wrd.toUpperCase();
    }

    String Round(String s) {
        res = wrd.substring(1, wrd.length()) + wrd.charAt(0);
        return res;
    }

    void display() {
        System.out.println("the ori word is: " + wrd);
        Round(wrd);
        System.out.println("The new word is: " + res);
    }

    public static void main(String args[]) {
        round obj = new round();
        obj.acceptword();
        obj.display();
    }

}