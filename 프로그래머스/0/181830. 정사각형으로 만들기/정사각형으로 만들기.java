class Solution {
    public int[][] solution(int[][] arr) {
        int col = arr[0].length;
        int row = arr.length;
        
        int[][] answer = {};
        if(col < row){
            answer = new int[row][row];
        } else {
            answer = new int[col][col];
        }
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}