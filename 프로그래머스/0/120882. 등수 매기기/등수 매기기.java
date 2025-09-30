class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] result = new int[n];
        
        double[] averages = new double[n];
        for (int i = 0; i < n; i++) {
            averages[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        // 각 학생의 등수 계산
        for (int i = 0; i < n; i++) {
            int rank = 1;
            
            // 자신보다 평균이 높은 학생의 수를 세기
            for (int j = 0; j < n; j++) {
                if (averages[j] > averages[i]) {
                    rank++;
                }
            }
            
            result[i] = rank;
        }
        
        return result;
    }
}