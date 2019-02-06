//https://leetcode.com/problems/sum-of-even-numbers-after-queries/
// #985
// Easy

class _985_Sum_of_Even_Numbers_After_Queries {

	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {

		int sum = 0;
		int[] evenSumsAfterQueries = new int[queries.length];

		for (int number : A) {
			if (number % 2 == 0)
				sum = number + sum;
		}

		int count = 0;
		for (int[] query : queries) {

			int originalNumber = A[query[1]];

			if (originalNumber % 2 == 0)
				sum = sum - originalNumber;

			int newNumber = A[query[1]] = A[query[1]] + query[0];

			if (newNumber % 2 == 0)
				sum = sum + newNumber;

			evenSumsAfterQueries[count] = sum;
			count++;
		}

		return evenSumsAfterQueries;
	}
}