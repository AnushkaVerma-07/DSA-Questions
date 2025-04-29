//12.	Rearrange numbers into the lexicographically next greater permutation.

import java.util.*;
public class NextPermutation {
    public static void nextPermutation(int[]arr){
        int n = arr.length;
        int i = n-2;

        while (i >= 0 && arr[i] >= arr[i+1]){
            i--;
        }

        if(i>=0){
            int j = n-1;
            while(arr[j] <= arr[i]){
                j--;
            }

            swap(arr,i,j);
        }
        reverse(arr, i+1 ,n-1);
    }

    private static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[]arr, int start, int end){
        while(start < end){
            swap(arr,start,end);
            start++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        nextPermutation(arr);

        System.out.println("Next Permutation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
