import java.util.*;

class Solution {
    public String[] solution(String[] record) {
       HashMap<String, String> hashMap = new HashMap<>();
		for (String s : record) {
			String[] sp = s.split(" ");
			if (sp[0].equals("Enter") || sp[0].equals("Change")) {
				hashMap.put(sp[1], sp[2]);
			}
		}

		ArrayList<String> result = new ArrayList<>();
		for (String s : record) {
			String[] sp = s.split(" ");
			if (sp[0].equals("Enter")) {
				result.add(hashMap.get(sp[1]) + "님이 들어왔습니다.");
			} else if (sp[0].equals("Leave")) {
				result.add(hashMap.get(sp[1]) + "님이 나갔습니다.");
			}
		}

		return result.toArray(new String[0]);
    }
}