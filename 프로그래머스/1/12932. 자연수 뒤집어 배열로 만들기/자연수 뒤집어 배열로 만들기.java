class Solution {
    public int[] solution(long n) {
        long k = n;
        int count = 0;
        while(k != 0){
            k = k / 10;
            count++;
        }
        
        int[] answer = new int[count];
        
        for(int i = 0; i < count; i++){
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}