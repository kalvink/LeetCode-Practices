package leetcode;

/* 
1342. Number of Steps to Reduce a Number to Zero
Given a non-negative integer num, return the number of steps to reduce it to zero. If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

Input: num = 14
Output: 6
Explanation: 
Step 1) 14 is even; divide by 2 and obtain 7. 
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3. 
Step 4) 3 is odd; subtract 1 and obtain 2. 
Step 5) 2 is even; divide by 2 and obtain 1. 
Step 6) 1 is odd; subtract 1 and obtain 0.

coded by Kalvin Kao
*/

class NumberOfSteps {
	public static int numberOfSteps(int num) {
		int count = 0;
		int temp;

		while (num != 0) {
			if (num % 2 == 0) {
				count++;
				temp = num;
				num = num / 2;

				System.out.println("Step " + count + ") " + temp + " is even; divide by 2 and obtain " + num + ".");
			} else if (num % 2 == 1) {
				count++;
				temp = num;
				num--;
				System.out.println("Step " + count + ") " + temp + " is odd; subtract 1 and obtain " + num + ".");

			}

		}

		return count;

	}

	public static void main(String args[]) {
		numberOfSteps(14);
	}

}