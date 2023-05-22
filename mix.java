import java.util.*;

public class mix {
    String wrd;
    int len;

    mix() {
        wrd = "";
        len = 0;
    }

    void feedword() {
        Scanner sc = new Scanner(System.in);
        wrd = sc.nextLine();
        len = wrd.length();
    }

    void mixword(mix p, mix q) {
        int i = 0;
        while (i < p.len && i < q.len) {
            this.wrd += p.wrd.charAt(i);
            this.wrd += q.wrd.charAt(i);
            i++;
        }

        if (i < p.len)
            this.wrd += p.wrd.substring(i);
        if (i < q.len)
            this.wrd += q.wrd.substring(i);
    }

    void show() {
        System.out.println("THe new word is: " + wrd);
    }

    public static void main(String args[]) {
        mix a = new mix();
        System.out.println("Enter the first word");
        a.feedword();
        mix b = new mix();
        System.out.println("Enter the second word");
        b.feedword();
        mix obj = new mix();
        obj.mixword(a, b);
        obj.show();
    }
}