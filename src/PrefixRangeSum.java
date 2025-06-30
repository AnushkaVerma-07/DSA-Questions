//Write a program to find the sum of elements in a given range [L, R] using a prefix sum array.

import java.util.Scanner;

public class PrefixRangeSum {
    public static int[] PrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i  < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];
        arr[0] = 0;  // setting 0th element to 0 for easy prefix sum calculation
        System.out.println("Enter " + n + " elements:");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefixSum = PrefixSum(arr);
        System.out.println("Enter number of queries:");
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.println("Enter range (l r):");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefixSum[r] - prefixSum[l - 1];
            System.out.println("Sum = " + ans);
        }

        sc.close();
    }
}
