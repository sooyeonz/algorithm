import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        numbers = Arrays.stream(numbers)
        			.boxed()
        			.sorted(Comparator.reverseOrder())
        			.mapToInt(Integer::intValue).toArray();
        
        return numbers[0] * numbers[1];
    }
}