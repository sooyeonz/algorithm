class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        int start = 0;
        int end = num_list.length - 1;
        int step = 1;
        
        if (n == 1) {
            end = b;
        } else if (n == 2) {
            start = a;
        } else if (n == 3) {
            start = a;
            end = b;
        } else if (n == 4) {
            start = a;
            end = b;
            step = c;
        }
        
        int length = ((end - start) / step) + 1;
        
        int[] answer = new int[length];
        int idx = 0;
        
        for (int i = start; i <= end; i += step) {
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}