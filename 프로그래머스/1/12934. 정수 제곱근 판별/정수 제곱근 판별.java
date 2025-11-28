class Solution {
    public long solution(long n) {
        double x = Math.sqrt(n);

        if (x % 1 != 0) { 
            return -1;
        }

        long y = (long)x + 1;
        return y * y;
    }
}