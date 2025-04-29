//Solve the problem of finding the equilibrium index in an array.

import java.util.Scanner;

public class EquilibriumIndex {
    public static boolean EquilibriumIndex(int[] arr){
        int totalSum = 0;
        for(int value : arr){
            totalSum +=value;
        }

        int leftSum = 0;
        boolean found = false;
        for(int i = 0; i<arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if(leftSum == rightSum){
                System.out.println("Equilibrium index " + i);
                return true;
            }
            leftSum +=arr[i];
        }
        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        arr[0] = 0;
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean hasEquilibrium = EquilibriumIndex(arr);

        if (!hasEquilibrium) {
            System.out.println("No equilibrium index found.");
        }
    }
}
