class Solution {
    public int solution(int number, int limit, int power) {
        
        int[] facNum = new int[number + 1];
        
        for(int i = 1; i <= number; i++){
            int count = 0;
            for(int j = 1; j * j <= i; j++){
                if(i % j == 0){      
                    if(j * j == i){
                        count += 1;
                    } else {
                        count += 2;
                    }
                }
            }
            facNum[i] = count;
        }
        
        int answer = 0;
        for(int i : facNum){
            if (i > limit){
                answer += power;
            } else {
                answer += i;
            }
        }
        
        return answer;
    }
}