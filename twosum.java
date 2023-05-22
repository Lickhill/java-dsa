import java.util.*;

class twoadd {
    public int[] twoSum(int[] nums, int target) {
        int i, j;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = i + 1; i < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + nums[i] + "," + nums[j] + "]");
                    break;
                }
            }
            if (nums[i] + nums[j] == target)
                break;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter the elements");
        for (int k = 0; k < x; k++)
            arr[k] = sc.nextInt();
        System.out.println("Enter the target");
        int tar = sc.nextInt();

        twoadd obj = new twoadd();
        obj.twoSum();

    }

}