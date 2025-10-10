class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1]; 
            int k = queries[i][2];
            
            int minValue = Integer.MAX_VALUE;
            
            for(int j = s; j <= e; j++){
                if(arr[j] > k && arr[j] < minValue){
                    minValue = arr[j];
                }
            }
            answer[i] = (minValue == Integer.MAX_VALUE) ? -1 : minValue;
        } 
        
        return answer;
    }
}