public class KeypadCombinations {
    public static void combinations(String dig, String[] kp, String res){
        if(dig.length() == 0){
            System.out.println(res + " ");
            return;
        }

        int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];
        for(int j = 0; j< currChoices.length(); j++) {
            combinations(dig.substring(1), kp, res + currChoices.charAt(j));
        }
    }

    public static void main(String[] args) {
        String dig = "253";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combinations(dig, kp, "");
    }
}
