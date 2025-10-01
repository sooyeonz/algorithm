class Solution {
    public int solution(int[] common) {
        int gap = 0;
        
        if(common[1] - common[0] == common[2] - common[1]){
            gap = common[1] - common[0];
            return common[common.length - 1] + gap;
        } else {
            gap = common[1] / common[0];
            return common[common.length - 1] * gap;
        }
    }
}