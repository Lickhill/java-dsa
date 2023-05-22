import java.util.*;

public class student {
    String nam;
    int dob;
    int roll;

    void inputdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        nam = sc.nextLine();
        System.out.println("Enter the date of birth");
        dob = sc.nextInt();
        System.out.println("Enter the roll number");
        roll = sc.nextInt();
    }

    void printdata() {
        System.out.println("the name is:" + nam);
        System.out.println("the dob is:" + dob);
        System.out.println("the roll is:" + roll);
    }

    public static void main(String args[]) {
        student obj = new student();
        obj.inputdata();
        obj.printdata();
    }
}
