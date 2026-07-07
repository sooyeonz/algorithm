class Solution {
    public String solution(int a, int b) {
        
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int dayTotal = 0;
        for(int i = 0; i < a - 1; i++){
            dayTotal += days[i];
        }
        dayTotal += b;
        
        return week[dayTotal % 7];
    }
}