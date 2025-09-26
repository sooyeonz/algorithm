class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int safeCount = 0;
        
        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    boolean isSafe = true;
                    
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        
                        if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                            isSafe = false;
                            break;
                        }
                    }
                    
                    if (isSafe) {
                        safeCount++;
                    }
                }
            }
        }
        
        return safeCount;
    }
}