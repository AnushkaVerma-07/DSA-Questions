// Rat in a maze in 4 directions(left, right, up, down)
public class RatInAMaze2 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];
        maze(0,0,rows -1,cols -1,"", isVisited);
    }

    private static void maze(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {
        if(sr<0 || sc<0)
            return;
        if(sr>er || sc > ec)
            return;
        if(isVisited[sr][sc] == true)  //means column is already visited
            return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;

        maze(sr+1,sc,er,ec,s+"D", isVisited); //go down
        maze(sr,sc+1,er,ec,s+"R", isVisited); // go right
        maze(sr-1,sc, er,ec, s+'U', isVisited); //go left
        maze(sr,sc-1,er,ec,s+'L', isVisited); //go up

        isVisited[sr][sc] = false;  //backtracking
    }
}
