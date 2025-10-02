class Solution {
    public int solution(int a, int b) {      
        String sum = "" + a + b;
        Integer sumInt = Integer.parseInt(sum);
        int mul = 2 * a * b;
        
        return (sumInt > mul) ? sumInt : mul; 
    }
}