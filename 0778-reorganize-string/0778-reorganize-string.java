import java.util.*;

class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        // Priority Queue with custom comparator to sort characters by frequency (max heap)
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));

        for (char c : hm.keySet()) {  // \U0001f501 FIX: keySet() is lowercase 'k'
            pq.add(c);
        }

        StringBuilder sb = new StringBuilder();

        while (pq.size() > 1) {
            char f = pq.poll();
            char s1 = pq.poll();

            sb.append(f);
            sb.append(s1);

            hm.put(f, hm.get(f) - 1);
            hm.put(s1, hm.get(s1) - 1);  // \U0001f501 FIX: You had hm.put(f, ...) twice!

            if (hm.get(f) > 0) {
                pq.add(f);
            }
            if (hm.get(s1) > 0) {
                pq.add(s1);
            }
        }

        // If one char is left
        if (!pq.isEmpty()) {
            char last = pq.poll();
            if (hm.get(last) > 1) {
                return "";  // not possible
            }
            sb.append(last);
        }

        return sb.toString();
    }
}
