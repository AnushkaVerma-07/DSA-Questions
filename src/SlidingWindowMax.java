//Sliding Window Maximum: Find the maximum value in every window of size K

import java.util.*;
public class SlidingWindowMax {

    // Function to return list of max elements in each window
    public static List<Integer> maxInWindows(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>(); // Will store indexes

        for (int i = 0; i < arr.length; i++) {

            // Remove indices that are out of the current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove elements smaller than current from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i); // Add current index

            // Add to result when the first window is formed
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size (k): ");
        int k = sc.nextInt();

        List<Integer> result = maxInWindows(arr, k);
        System.out.println("Maximum values in each window:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
