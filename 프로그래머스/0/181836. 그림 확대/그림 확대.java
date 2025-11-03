import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> result = new ArrayList<>();

        for (String line : picture) {
            StringBuilder expanded = new StringBuilder();
            for (char c : line.toCharArray()) {
                expanded.append(String.valueOf(c).repeat(k));
            }

            for (int i = 0; i < k; i++) {
                result.add(expanded.toString());
            }
        }

        return result.toArray(new String[0]);
    }
}