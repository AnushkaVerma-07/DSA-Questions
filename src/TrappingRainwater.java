//Trapping Rainwater: calculate how much water can be trapped between the bars after raining.

import java.util.*;
public class TrappingRainwater {
    public static int trap(int[] height){
        int n = height.length;
        if(n==0)
            return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for(int i = 1; i<height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int trappedwater = 0;
        for(int i = 0; i<n; i++){
            trappedwater +=Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] height = new int[n];
        System.out.println("Enter " + n + " bar heights:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int result = trap(height);
        System.out.println("Total trapped water: " + result);

    }

}
