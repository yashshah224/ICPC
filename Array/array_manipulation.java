import java.util.Scanner;

public class array_Manipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, i;
        long max = 0, x = 0;
        int n;
        n = sc.nextInt();
        k = sc.nextInt();
        long[] arr = new long[n+1];
        int a, b, m;
        for(i = 0; i < k; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            m = sc.nextInt();
            arr[a] += m;
            if((b+1) <= n)
                arr[b+1] -= m;
        }
        for(i = 1; i <= n; i++) {
            x = x + arr[i];
            if(max < x)
                max = x;
        }
        System.out.println(max);
    }
}
