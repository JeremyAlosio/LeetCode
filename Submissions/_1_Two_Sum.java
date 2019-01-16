import java.util.HashMap;

///https://leetcode.com/problems/two-sum/
// #1
// Easy
public class _1_Two_Sum {
	public int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return new int[] {};
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				int[] result = { map.get(target - nums[i]), i };
				return result;
			}
			map.put(nums[i], i);
		}
		return new int[] {};
	}

}
