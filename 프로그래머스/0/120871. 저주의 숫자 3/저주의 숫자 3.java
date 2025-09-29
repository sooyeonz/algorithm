class Solution {
    public int solution(int n) {
        int count = 0;
        int current = 1;
        
        while (count < n) {
            if (current % 3 != 0 && !String.valueOf(current).contains("3")) {
                count++;
                if (count == n) {
                    return current;
                }
            }
            current++;
        }
        
        return -1;
    }
}