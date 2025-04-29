//16.	Find the majority element in an array that appears more than n/2 times.

public class MajorityElement {
    public static int findMajorityElement(int[] arr){
        int candidate = arr[0];
        int count  = 0;
        for(int num : arr){
            if(count == 0){
                candidate = num;
            }
            count +=(num == candidate) ? 1:-1;
        }

        count = 0;
        for (int num : arr){
            if (num == candidate){
                count ++;
            }
        }

        if(count > arr.length / 2){
            return candidate;
        }
        else {
            throw new IllegalArgumentException("No majority element found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2,2,1,1,2,2,2};
        System.out.println("Majority Element: " + findMajorityElement(arr));
    }
}
