public class UniqueDigitCounter {
    public static int UniqueDigitNumbers(int n){
        if(n == 0)
            return 1;

        int total = 10;
        int uniqueDigits = 9;
        int availableDigits = 9;

        for(int i = 2;  i<=n && availableDigits > 0; i++){
            uniqueDigits *= availableDigits;
            total +=uniqueDigits;
            availableDigits--;
        }
        return total;
    }

    public static void main(String[] args) {
        int n =2;
        System.out.println("Count of numbers with unique digits < 10" + n + " = " + UniqueDigitNumbers(n));
    }
}
