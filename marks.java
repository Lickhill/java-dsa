import java.util.*;

public class marks extends student {
    double tot, per;
    char gd;

    void readdata() {
        super.inputdata();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks");
        tot = sc.nextDouble();

    }

    void compute() {
        per = (tot / 500) * 100;
        if (per >= 85)
            gd = 'A';
        else if (per < 85 && per >= 60)
            gd = 'B';
        else if (per >= 40 && per < 60)
            gd = 'C';
        else
            gd = 'D';
    }

    void showdata() {
        System.out.println("The student's details:");
        super.printdata();
        compute();
        System.out.println("The total marks obtained " + tot);
        System.out.println("The percentage obtained " + per);
        System.out.println("The grade obtained " + gd);
    }

    public static void main(String args[]) {
        marks obj = new marks();
        obj.readdata();
        obj.showdata();
    }
}
