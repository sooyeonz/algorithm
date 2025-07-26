import java.util.*;

class Solution {
    public int solution(String s) {
        List<Integer> scores = new ArrayList<>();
        String[] operations = s.split(" ");
        
        for (String op : operations) {
            if (op.equals("Z")) {
                if (!scores.isEmpty()) {
                    scores.remove(scores.size() - 1);
                }
            } else {
                scores.add(Integer.parseInt(op));
            }
        }
        
        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}