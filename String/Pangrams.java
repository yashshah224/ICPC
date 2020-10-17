import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pangrams {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) < 97)
                a[s.charAt(i) - 65] = 1;
            else if (s.charAt(i) >= 97)
                a[s.charAt(i) - 97] = 1;
        }
        boolean b = true;
        for (int i = 0; i < 26; i++) {
            if (a[i] == 0)
                b = false;
        }
        if(b)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
    }
}
