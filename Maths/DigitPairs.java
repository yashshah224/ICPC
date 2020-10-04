import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DigitPairs {
    static int bit_score(int n) {
        int a, b, c, largest, smallest;
        int score;

        a = n%10; n/=10;
        b = n%10; n/=10;
        c = n%10; n/=10;

        largest = (a>b) ? a : b;
        largest = (c>largest) ? c : largest;
        smallest = (a<b) ? a : b;
        smallest = (c<smallest) ? c : smallest;

        score = largest * 11 + smallest * 7;

        score = score % 100;
        return score;
    }
    static int findpairs(int[] main_arr, int n) {
        int[] sig_dig = new int[10];
        int i, pairs = 0, msb;

        for(i=0; i<10; i++) {
            sig_dig[i] = 0;
        }

        for(i=0; i<n; i=i+2) {
            msb = main_arr[i] / 10;
            for(int j =i+2; j<n; j=j+2){
                if(msb == main_arr[j]/10){
                    if(sig_dig[msb] < 2) {
                        sig_dig[msb]++;
                    }
                }
            }

        }

        for(i=1; i<n; i=i+2) {
            msb = main_arr[i] / 10;
            for(int j =i+2; j<n; j=j+2){
                if(msb == main_arr[j]/10){
                    if(sig_dig[msb] < 2) {
                        sig_dig[msb]++;
                    }
                }
            }
        }

        for(i=0; i<10; i++) {
            pairs = pairs + sig_dig[i];
        }

        return pairs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();
        int pairs;
        int[] ip_arr = new int[n];
        int[] bit_arr = new int[n];
        for(i = 0; i < n; i++) {
            ip_arr[i] = sc.nextInt();
        }
        for(i = 0; i < n; i++) {
            bit_arr[i] = bit_score(ip_arr[i]);
        }
        pairs = findpairs(bit_arr, n);
        System.out.println(pairs);
    }
}
