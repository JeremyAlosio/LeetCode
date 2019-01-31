//https://leetcode.com/problems/sort-array-by-parity/
// #905
// Easy

class _905_Sort_Array_By_Parity {

    public int[] sortArrayByParity(int[] A) {
        int[] sorted = new int[A.length];
        int front = 0;
        int back = A.length-1;


        for(int currentNumber : A) {
            if(currentNumber % 2 == 0) {
                sorted[front] = currentNumber;
                front++;
            } else {
                sorted[back] = currentNumber;
                back--;
            }
        }

        return sorted;
    }

}