public class RatInADeadMaze {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] path = {{0,0,0},
                        {0,1,0},
                        {0,0,0}};
        maze(0,0,rows-1,cols-1,"",path);
    }

    private static void maze(int sr, int sc, int er, int ec, String s, int[][] path) {
        if(sr<0 || sc<0)
            return;
        if(sr>er || sc > ec)
            return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        if(path[sr][sc] == 1)
            return;

        maze(sr+1,sc,er,ec,s+"D", path); //go down
        maze(sr,sc+1,er,ec,s+"R", path); // go right
    }

}
