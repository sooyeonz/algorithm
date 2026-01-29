class Solution {
    public long solution(int price, int money, int count) {
        
        long pay = 0;
        for(int i = 1; i <= count; i++){
            pay = pay + (price * i);
        }

        long answer = money - pay;
        
        return answer >= 0 ? 0 : answer * -1;
    }
}