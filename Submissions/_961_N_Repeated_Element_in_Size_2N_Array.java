import java.util.HashSet;

//https://leetcode.com/problems/squares-of-a-sorted-array/
// #977
// Easy

public class _961_N_Repeated_Element_in_Size_2N_Array {
	public int repeatedNTimes(int[] A) {
        HashSet<Integer> elements = new HashSet<Integer>();
        
        for(int element : A) {
            if(elements.contains(element))
                return element;
            else
                elements.add(element);
        }        
        return -1;
    }
}
