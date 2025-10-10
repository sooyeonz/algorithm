class Solution {
    public int solution(int[] num_list) {
        int numMul = 1;
        int numSqrt = 0;
        
        for(int i : num_list){
            numMul *= i;
            numSqrt += i;
        }
        numSqrt *= numSqrt;
        
        return numMul > numSqrt ? 0 : 1;
    }
}