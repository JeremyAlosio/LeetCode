//https://leetcode.com/problems/to-lower-case/
// #709
// Easy

public class _709_To_Lower_Case {
	public static String toLowerCase(String str) {
		StringBuilder lowerCased = new StringBuilder();

		for (Character c : str.toCharArray()) {
			if ((int) c < 90 && (int) c > 64)
				lowerCased.append((char)((int) c + 32));
			else
				lowerCased.append(c);
		}

		return lowerCased.toString();
	}
}
