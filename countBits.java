import java.util.Scanner;

public class countBits {

    static int countSetBits(int t) {
        int count = 0;
        while(t > 0) {
            t = t & (t-1);
            count++;
        }
        return count;
    }

    static int[] countTotalBits(int n) {
        int[] res = new int[n+1];
        for(int i = 0; i <= n; i++) {
            if(i == 0) {
                res[i] = 0;
            } else {
                res[i] = countSetBits(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res;
        int sum = 0;
        res = countTotalBits(n);
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
            sum += res[i];
        }
        int result = sum % 1000000007;
        System.out.println(result);

        /* Another Approach */
//        int[] num = new int[n+1];
//        num[0] = 0;
//        for(int i = 1; i <= n; i++) {
//            num[i] = num[i >> 1] + (i & 1);
//        }
//        for(int i = 0; i <= n; i++) {
//            System.out.print(num[i]+" ");
//        }

        /* Another Approach */
//        int[] num = new int[n+1];
//        num[0] = 0;
//        for(int i = 1; i <= n; i++) {
//            num[i] = num[i/2] + i%2;
//        }
//        for(int i = 0; i <= n; i++) {
//            System.out.print(num[i]+" ");
//        }
    }
}
