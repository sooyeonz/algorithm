class Solution {
    public int solution(int[][] dots) {
        
        int[] A = dots[0], B = dots[1], C = dots[2], D = dots[3];
        
        if (isParallel(A, B, C, D) || 
            isParallel(A, C, B, D) || 
            isParallel(A, D, B, C)) {
            return 1;
        }
        
        return 0;
    }
    
    private boolean isParallel(int[] p1, int[] p2, int[] p3, int[] p4) {
        int dx1 = p2[0] - p1[0];
        int dy1 = p2[1] - p1[1]; 
        int dx2 = p4[0] - p3[0]; 
        int dy2 = p4[1] - p3[1]; 
        
        return dy1 * dx2 == dy2 * dx1;
    }
}