import java.util.*;

public class convert {
    int n, d, y, m;

    convert() {
        n = m = y = d = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date");
        d = sc.nextInt();
        System.out.println("Enter the year");
        y = sc.nextInt();
    }

    void daytodate() {
        accept();
        if (y % 4 == 0) {
            if (d > 366) {
                System.out.println("INVALID INPUT");
                System.exit(0);
            }
        } else {
            if (d > 365) {
                System.out.println("INVALID INPUT");
                System.exit(0);
            }
        }

        int arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (y % 4 == 0)
            arr[1] = 29;

        if (d <= 31)
            m = 0;
        else {
            while (d >= 0) {
                d = d - arr[m];
                m++;
                if (d <= arr[m])
                    break;
            }
        }
    }

    void display() {
        daytodate();
        String a[] = { "January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ", "September ",
                "October ", "November ", "December " };
        System.out.println(d + " " + a[m] + y);

    }

    public static void main(String args[]) {
        convert obj = new convert();
        obj.display();
    }
}
