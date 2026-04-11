class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int quo = n;
        
        while(quo >= a){
            int received = (quo / a) * b;
            int remain = quo % a;
            answer += received;
            quo = received + remain;
        }
        
        return answer;
    }
}