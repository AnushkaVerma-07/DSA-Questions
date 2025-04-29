//Check if an array can be split into two parts such that the sum of the prefix equals the sum of the suffix.

import java.util.*;
public class SplitArray {
        public static boolean split(int[]arr){
            int total = 0;
            for(int num:arr){
                total +=num;
            }

            int prefix = 0;
            for(int i = 0; i< arr.length-1; i++){
                prefix += arr[i];
                if(prefix == total -prefix) {
                    return true;
                }
            }
            return false;
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

        boolean canSplit = split(arr);
        if(canSplit){
            System.out.println("It can Split");
        }
        else {
            System.out.println("It cannot split");
        }
    }
}
