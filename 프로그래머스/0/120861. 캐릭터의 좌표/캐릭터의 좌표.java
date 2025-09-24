class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};

        int maxX = (board[0] - 1) / 2;
        int maxY = (board[1] - 1) / 2;

        for (String str : keyinput) {
            if (str.equals("left") && answer[0] > -maxX) {
                answer[0]--;
            } else if (str.equals("right") && answer[0] < maxX) {
                answer[0]++;
            } else if (str.equals("up") && answer[1] < maxY) {
                answer[1]++;
            } else if (str.equals("down") && answer[1] > -maxY) {
                answer[1]--;
            }
        }
        return answer;
    }
}