import java.util.*;

public class merge {
    int n1, n2;
    long mergenum;

    merge() {
        n1 = n2 = 0;
        mergenum = 0;
    }

    void readnum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
    }

    void join() {
        String x = "";
        String y = "";
        x = Integer.toString(n1);
        y = Integer.toString(n2);
        String f = x + y;
        long w = Long.parseLong(f);
        mergenum = w;
    }

    void show() {
        System.out.println("The original number are " + n1 + " and " + n2);
        join();
        System.out.println("THe new num is " + mergenum);
    }

    public static void main(String args[]) {
        merge obj = new merge();
        obj.readnum();
        obj.show();
    }
}
