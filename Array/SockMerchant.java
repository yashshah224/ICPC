import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new HashMap<>();
        int n;
        int[] c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        c = new int[n];

        String[] temp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(temp[i]);
            map.put(c[i], (map.get(c[i]) == null) ? 1 : map.get(c[i]) + 1);
        }
        Object[] keys;
        keys = map.keySet().toArray();
        int count = 0;
        for (int i = 0; i < keys.length; i++)
            count += map.get(Integer.parseInt(keys[i].toString())) / 2;
        System.out.println(count);
    }
}
