//Maximum Subarray:Find the contiguous subarray with the largest sum (Kadane’s algorithm)

import java.util.Scanner;

public class MaximumSubarrayKadane {

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];  // Initialize with the first element
        int maxSum = nums[0];      // Initialize maxSum

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray or start new from current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum is: " + result);
    }
}
