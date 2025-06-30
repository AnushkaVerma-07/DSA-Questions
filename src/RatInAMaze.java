// Rat in a maze in 2 directions (down and right)
public class RatInAMaze {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        maze(1,1,rows,cols,"");
    }

    private static void maze(int sr, int sc, int er, int ec, String s) {
        if(sr>er || sc > ec)
            return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        maze(sr+1,sc,er,ec,s+"D"); //go down
        maze(sr,sc+1,er,ec,s+"R"); // go right
    }
}
