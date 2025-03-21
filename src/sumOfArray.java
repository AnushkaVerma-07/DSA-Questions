public class sumOfArray {
    public static int sumOfArray(){
        int[] arr = {1,4,5};
        int sum=0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfArray());
    }
}
