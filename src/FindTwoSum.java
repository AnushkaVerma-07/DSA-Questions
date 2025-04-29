//	Find two numbers in a sorted array that add up to a target.

import java.util.*;
public class FindTwoSum{
    public static void findTwoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;

        while(left < right){
            int sum = arr[left] + arr[right];

            if (sum == target){
                System.out.println("Two numbers are: "+arr[left]+ " and "+ arr[right]);
                return;
            } else if (sum < target) {
                left++;
            }
            else
                right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        findTwoSum(arr, target);
    }
}
