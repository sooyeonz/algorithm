class Solution {
    public int solution(int[] num_list) {        
        String evenStr = "";
        String oddStr = "";
        
        for(int i: num_list){
            if(i % 2 == 0){
                evenStr += i;
            } else {
                oddStr += i;
            }
        }
        
        return Integer.parseInt(evenStr) + Integer.parseInt(oddStr);
    }
}