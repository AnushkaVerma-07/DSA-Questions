//Find the maximum sum of any subarray of size K in a given array

import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxSubArray {
    public static int maxSum(int[]arr, int k){
        int windowSum = 0;
        for(int i = 0; i<k ; i++){
            windowSum +=arr[i];
        }

        int maxSum = windowSum;
        for(int i = k ; i< arr.length; i++){
            windowSum+= arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Max Subarray is " +maxSum(arr,3) );
    }
}
