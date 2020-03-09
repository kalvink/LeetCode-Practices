package leetcode;

/* 
 * 1365. How Many Numbers Are Smaller Than the Current Number
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * Return the answer in an array.
 * 
 * Example
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 * Explanation: 
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1). 
 * For nums[3]=2 there exist one smaller number than it (1). 
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 * 
 * coded by Kalvin Kao

*/

public class SmallerThanCurrentNum {

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int count = 0;
		Object[] outnums = new Object[nums.length];
		int[] arr = { 0, 0, 0, 0, 0 };

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					count++;
				}
			}
			outnums[i] = count;
			count = 0;
		}
		return iterate(outnums, nums);

	}

	public static int[] iterate(Object[] outnums, int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (Integer) outnums[i];
			System.out.print(nums[i]);
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 8, 1, 2, 2, 3 };
		smallerNumbersThanCurrent(nums);
	}
}
