class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int kAnt = hp / 5;
        hp -= (kAnt * 5);
        
        int bAnt = hp / 3;
        hp -= (bAnt * 3);
        
        answer = kAnt + bAnt + hp;
        
        return answer;
    }
}