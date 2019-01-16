import java.util.HashMap;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
//#3
//Medium

public class _3_Longest_Substring_Without_Repeating_Characters {
	public int lengthOfLongestSubstring(String s) {
		// Quick out
		if (s == null || s.isEmpty())
			return 0;
		if (s.length() == 1)
			return 1;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int subStart = 0;
		int max = 0;

		for (int index = 0; index < s.length(); index++) {
			if (map.containsKey(s.charAt(index)) && map.get(s.charAt(index)) >= subStart) {
				subStart = map.get(s.charAt(index)) + 1;
				map.put(s.charAt(index), index);
			} else {
				map.put(s.charAt(index), index);
				max = Math.max(max, s.substring(subStart, index + 1).length());
			}
		}

		return max;

	}
}
