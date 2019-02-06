//https://leetcode.com/problems/hamming-distance/
// #461
// Easy

public class _461_Hamming_Distance {

	public static int hammingDistance(int x, int y) {
		String sx = Integer.toBinaryString(x);
		String sy = Integer.toBinaryString(y);

		if ((sx.length() == 1 && sy.length() == 1) && sx.charAt(0) != sy.charAt(0))
			return 1;
		if (sx.length() > sy.length())
			return binaryCounter(sx, sy);
		else
			return binaryCounter(sy, sx);

	}

	public static int binaryCounter(String biggerString, String smallerString) {
		int count = 0;
		int leadingZeros = 0;
		int countedZeros = 0;

		leadingZeros = countedZeros = biggerString.length() - smallerString.length();

		for (int index = 0; index < biggerString.length(); index++) {
			if (countedZeros > 0) {
				if(biggerString.charAt(index) == '1')
					count++;
				countedZeros--;
				continue;
			} else if (biggerString.charAt(index) != smallerString.charAt(index - leadingZeros))
				count++;
		}

		return count;
	}
}
