import java.util.HashSet;
import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = 0, j = 0, max = 0;
        HashSet<Character> set = new HashSet<>();
        while(j < str.length()) {
            if(!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                j++;
                max = Math.max(set.size(), max);
            }
            else {
                set.remove(str.charAt(i));
                i++;
            }
        }
        System.out.println(max);
    }
}
