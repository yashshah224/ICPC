import java.util.Scanner;

public class IncreasingTripletSubsequence {

    static boolean checkIncreasingSubSequence(int[] nums) {
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n <= small) small = n;
            else if(n <= big) big = n;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean result = checkIncreasingSubSequence(arr);
        System.out.println(result);
    }
}
