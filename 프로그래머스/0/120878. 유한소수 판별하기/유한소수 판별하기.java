class Solution {
    public int solution(int a, int b) {
        int g = gcd(a, b);
        int denominator = b / g;
        
        while (denominator % 2 == 0) {
            denominator /= 2;
        }
        while (denominator % 5 == 0) {
            denominator /= 5;
        }
        
        if (denominator == 1) {
            return 1;
        } else {
            return 2;
        }
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}