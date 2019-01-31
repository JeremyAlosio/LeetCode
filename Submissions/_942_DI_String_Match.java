//https://leetcode.com/problems/di-string-match/
// #942
// Easy

class _942_DI_String_Match {

    public int[] diStringMatch(String S) {

        int[] matched = new int[S.length()+1];
        int front = 0;
        int back = S.length();

        for(int index = 0; index < S.length(); index++) {
            if(S.charAt(index) == 'I') {
                matched[index] = front++;
            } else {
                matched[index] = back--;
            }
        }

        matched[matched.length-1] = front;

        return matched;
    }

}