package Recursion_and_Backtracking.Codes;
import java.util.*;

public class KnightsTour {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int srow = scn.nextInt();
        int scol = scn.nextInt();
        
        int[][] chess = new int[n][n];
        scn.close();
        printKnightsTour(chess,srow,scol,1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        
        if(r < 0 || c < 0 || r>= chess.length || c>= chess.length || chess[r][c] > 0) return;
        
        chess[r][c] = upcomingMove;
        if(upcomingMove == chess.length * chess.length) {
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        
        printKnightsTour(chess,r-2,c+1,upcomingMove + 1);
        printKnightsTour(chess,r-1,c+2,upcomingMove + 1);
        printKnightsTour(chess,r+1,c+2,upcomingMove + 1);
        printKnightsTour(chess,r+2,c+1,upcomingMove + 1);
        printKnightsTour(chess,r+2,c-1,upcomingMove + 1);
        printKnightsTour(chess,r+1,c-2,upcomingMove + 1);
        printKnightsTour(chess,r-1,c-2,upcomingMove + 1);
        printKnightsTour(chess,r-2,c-1,upcomingMove + 1);
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}