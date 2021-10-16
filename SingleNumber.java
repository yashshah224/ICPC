import java.util.Arrays;
import java.util.Scanner;


public class SingleNumber {

    static int findNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            res = res ^ nums[i]; // We know that 2^2 = 0; so for e.g. 5^4^3^4^5 = 3
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = findNumber(arr);
        System.out.println(res);
    }
}
