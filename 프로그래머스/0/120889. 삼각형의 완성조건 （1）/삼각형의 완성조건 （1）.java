import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int longest = sides[2];
        int sum = sides[0] + sides[1];
        
        if (longest < sum) {
            return 1;
        } else {
            return 2;
        }
    }
}