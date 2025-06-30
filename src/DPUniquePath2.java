public class DPUniquePath2 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] path = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}};
        int[][] dp = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                dp[i][j] = -1;
            }
        }

        int totalPaths = countPaths(0,0,rows-1,cols-1,path,dp);
        System.out.println("Total Paths" + totalPaths);
    }

    public static int countPaths(int sr, int sc, int er, int ec, int[][] path, int[][] dp){
        if(sr<0 || sc<0)
            return 0;
        if(sr>er || sc > ec)
            return 0;
        if(sr == er && sc == ec){
            return 1;
        }
        if(path[sr][sc] != -1)
            return dp[sr][sc];

        int down = countPaths(sr + 1, sc, er, ec, path, dp);
        int right = countPaths(sr, sc + 1, er, ec, path, dp);

        dp[sr][sc] = down + right;

        return dp[sr][sc];
    }
}
