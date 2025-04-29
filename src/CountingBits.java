//Counting Bits: Count the number of 1s in the binary representation of numbers from 0 to n
import java.util.*;
public class CountingBits {
    public static int[] countBits(int n){
        int[] ans = new int[n+1];
        ans[0] = 0;

        for(int i = 1; i<=n; i++){
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        int[] result = countBits(n);
        System.out.println("Number of 1's from 0 to" + n + ":");
        System.out.println(Arrays.toString(result));
    }
}
