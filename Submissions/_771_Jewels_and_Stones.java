import java.util.HashSet;

//https://leetcode.com/problems/jewels-and-stones/
// #771
// Easy

public class _771_Jewels_and_Stones {
	public int numJewelsInStones(String J, String S) {
		int totalJewels = 0;

		HashSet<Character> diamondsInTheRough = new HashSet<Character>();

		for (Character c : J.toCharArray())
			diamondsInTheRough.add(c);

		for (Character c : S.toCharArray()) {
			if (diamondsInTheRough.contains(c)) {
				totalJewels++;
			}
		}

		return totalJewels;
	}
}
