//https://leetcode.com/problems/flipping-an-image/
// #832
// Easy

class _832_Flipping_an_Image {

    public int[][] flipAndInvertImage(int[][] A) {

        int[][] reversed = new int[A.length][A[0].length];

        for(int row = 0; row < A.length; row++)
        {
            for(int cell = A[row].length-1, newCell = 0; cell >= 0; cell--, newCell++)
            {
                int newValue = 0;
                if(A[row][cell] == 0) newValue = 1;

                reversed[row][newCell] = newValue;
            }
        }

        return reversed;
    }
}