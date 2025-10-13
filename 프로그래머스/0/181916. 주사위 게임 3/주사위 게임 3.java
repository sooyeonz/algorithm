import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> count = new HashMap<>();
        int[] dice = {a, b, c, d};

        for(int num : dice) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        int uniqueCount = count.size();
        
        if(uniqueCount == 1) {
            return 1111 * a;
        }
        
        if(uniqueCount == 2) {
            List<Integer> numbers = new ArrayList<>();
            List<Integer> counts = new ArrayList<>();
            
            for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
                numbers.add(entry.getKey());
                counts.add(entry.getValue());
            }
            
            if(counts.contains(3)) {
                int p = counts.get(0) == 3 ? numbers.get(0) : numbers.get(1);
                int q = counts.get(0) == 1 ? numbers.get(0) : numbers.get(1);
                return (10 * p + q) * (10 * p + q);
            }
            
            int p = numbers.get(0);
            int q = numbers.get(1);
            return (p + q) * Math.abs(p - q);
        }

        if(uniqueCount == 3) {
            int product = 1;
            for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
                if(entry.getValue() == 1) { 
                    product *= entry.getKey();
                }
            }
            return product;
        }
        
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}