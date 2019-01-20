import java.util.Arrays;

//https://leetcode.com/problems/squares-of-a-sorted-array/
// #977
// Easy

class _977_Squares_of_a_Sorted_Array {
	
	public static int[] sortedSquares(int[] A) {
		int[] sorted = new int[A.length];
        
        for(int index = 0; index < A.length; index++) {
            sorted[index] = A[index] * A[index];
        }
        
        Arrays.sort(sorted); //Gave up and used Sort
        
        return sorted;        
	}
}

//WAY TOO SLOW, but wanted to keep it because of work on BST

/* 
public class _977_Squares_of_a_Sorted_Array {
	
	public static void main(String args[])
	{
		for(int element : sortedSquares(new int[] {-4,-1,0,3,10}))
		{
			System.out.println(element);
		}
	}
	
	public static int[] sortedSquares(int[] A) {
		BinaryTree orderedTree = new BinaryTree(A[0] * A[0]);

		for (int index = 1; index < A.length; index++) {
			orderedTree.addNode(A[index] * A[index]);
		}

		ArrayAdder output = new ArrayAdder(A.length);
		orderedTree.GenerateListInOrder(output);
		return output.getArrayList();
	}

}

class BinaryTree {

	private int data;
	private BinaryTree left;
	private BinaryTree right;
	
	public BinaryTree(int num) {
		this.data = num;
		this.left = null;
		this.right = null;
	}

	public void addNode(int num) {
		if (num < this.data) {
			if (this.left != null) {
				this.left.addNode(num);
			} else {
				this.left = new BinaryTree(num);
			}
		} else {
			if (this.right != null) {
				this.right.addNode(num);
			} else {
				this.right = new BinaryTree(num);
			}
		}
	}
	
	public void GenerateListInOrder(ArrayAdder output) {
		if (this.left != null) {
			this.left.GenerateListInOrder(output);
		}
		output.AddToArray(this.data);
		if (this.right != null) {
			this.right.GenerateListInOrder(output);
		}
	}
}

class ArrayAdder {
	
	int[] output;
	int newElementLocation = 0;
	
	public ArrayAdder(int size) {
		output = new int[size];
	}
	
	public void AddToArray(int element) {
		output[newElementLocation] = element;
		newElementLocation++;
	}
	
	public int[] getArrayList(){
		return output;
	}
	
} */