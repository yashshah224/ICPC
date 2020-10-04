import java.util.Scanner;

public class Gaming_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n, i, max, count;
        t = sc.nextInt();
        int num;
        while (t != 0) {
            n = sc.nextInt();
            max = 0;
            count = 0;
            for(i = 0; i < n; i++) {
                num = sc.nextInt();
                if(max < num) {
                    max = num;
                    count++;
                }
            }
            if(count % 2 == 0)
                System.out.println("ANDY");
            else
                System.out.println("BOB");
            t--;
        }
    }
}
