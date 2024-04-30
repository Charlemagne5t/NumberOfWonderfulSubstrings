import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long wonderfulSubstrings(String word) {
        int n = word.length();
        long count = 0;
        Map<Integer, Long> map = new HashMap<>();
        int mask = 0;
        map.put(0, 1L);
        for (int i = 0; i < n; i++) {
            int num = 1 << (word.charAt(i) - 'a');
            mask ^= num;
            count += map.getOrDefault(mask, 0L);
            for(int j = 0; j < 10; j++ ) {
                count += map.getOrDefault(mask ^ (1 << j), 0L);
            }
            long c = map.getOrDefault(mask, 0L);
            c++;
            map.put(mask, c);

        }


        return count;
    }
}
