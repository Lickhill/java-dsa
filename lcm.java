import java.util.*;

public class lcm {
    int n1, n2;
    int large, sm;
    int lcm;

    lcm() {
        n1 = n2 = large = sm = 0;
        lcm = 1;

    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Etner a nuber");
        n1 = sc.nextInt();
        System.out.println("Enter another number");
        n2 = sc.nextInt();
        if (n1 > n2) {
            large = n1;
            sm = n2;
        } else {
            large = n2;
            sm = n1;
        }

    }

    int getlcm(int large, int sm) {

        if (lcm % large == 0 && lcm % sm == 0)
            return lcm;
        else
            lcm = lcm + 1;
        return getlcm(large, sm);
    }

    void printdata() {
        System.out.println("The numbers are: "
                + n1 + " and " + n2);
        getlcm(large, sm);
        System.out.println("the lcm is " + lcm);
    }

    public static void main(String args[]) {
        lcm obj = new lcm();
        obj.accept();
        obj.printdata();
    }
}
