import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] hof = new int[k];
        
        for(int i = 0; i < score.length; i++){
            if(i < k){
                hof[i] = score[i];
            } else if(score[i] > hof[0]){
                hof[0] = score[i];
            }
            Arrays.sort(hof, 0, Math.min(i + 1, k));
            answer[i] = hof[0];
        }
        
        return answer;
    }
}