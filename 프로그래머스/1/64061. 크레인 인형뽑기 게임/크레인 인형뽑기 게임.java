import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

		Deque<Integer>[] stackLanes = new ArrayDeque[board.length];
		for (int i = 0; i < board.length; i++) {
			stackLanes[i] = new ArrayDeque<>();
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][i] != 0) {
					stackLanes[i].addLast(board[j][i]);
				}
			}
		}

		Deque<Integer> bucket = new ArrayDeque<>();
		for (int i = 0; i < moves.length; i++) {
			if (!stackLanes[moves[i] - 1].isEmpty()) {
				int n = stackLanes[moves[i] - 1].pop();

				if (!bucket.isEmpty() && bucket.peek().equals(n)) {
					bucket.pop();
					answer += 2;
				} else{
					bucket.push(n);
				}
			}
		}

		return answer;
    }
}