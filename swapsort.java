import java.util.*;

public class swapsort {
    String wrd, swapwrd, sortwrd;
    int len;

    swapsort() {
        wrd = "";
        sortwrd = "";
        swapwrd = "";
        len = 0;
    }

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        wrd = sc.nextLine();
        wrd = wrd.toUpperCase();

    }

    void swapword() {
        swapwrd = wrd.charAt(wrd.length() - 1) + wrd.substring(1, wrd.length() - 1) + wrd.charAt(0);
    }

    void sortword() {
        int i;
        String f = "";
        for (i = 0; i < wrd.length(); i++) {
            char ch = wrd.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                sortwrd = sortwrd + ch;
            else
                f = f + ch;
        }
        sortwrd = sortwrd + f;
    }

    void display() {
        System.out.println("The entered word is:" + wrd);
        System.out.println("The swapped word is:" + swapwrd);
        System.out.println("The sorted word is:" + sortwrd);
    }

    public static void main(String args[]) {
        swapsort obj = new swapsort();
        obj.readword();
        obj.swapword();
        obj.sortword();
        obj.display();
    }
}
