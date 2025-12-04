import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
		HashMap<String, Integer> count = new HashMap<>();

		for (String s : report) {
			String[] strings = s.split(" ");
			String userId = strings[0];
			String reportedId = strings[1];

			if (!reportMap.containsKey(reportedId)) {
				reportMap.put(reportedId, new HashSet<>());
			}

			reportMap.get(reportedId).add(userId);
		}

		for (Map.Entry<String, HashSet<String>> entry : reportMap.entrySet()) {
			if (entry.getValue().size() >= k) {
				for (String s : entry.getValue()) {
					count.put(s, count.getOrDefault(s, 0) + 1);
				}
			}
		}

		int[] answer = new int[id_list.length];

		for (int i = 0; i < id_list.length; i++) {
			answer[i] = count.getOrDefault(id_list[i], 0);

		}

		return answer;
    }
}