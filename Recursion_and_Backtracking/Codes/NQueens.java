package Recursion_and_Backtracking.Codes;
import java.util.*;

public class NQueens {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean[][] chess = new boolean[n][n];
        scn.close();
        printNQueens(chess,"",0);
    }
    
    public static boolean isQueenSafe(boolean[][] chess,int row, int col) {
        
        //upward col
        
        int i = 0;
        while(i < row) {
            if(chess[i][col] == true) return false;
            i++;
        }
        
        //upward left diagonal
        i = row;
        int j = col;
        while(i >= 0 && j >= 0) {
            if(chess[i][j] == true) return false;
            i--;
            j--;
        }
        
        //upward right diagonal
        i = row;
        j = col;
        while(i >= 0 && j< chess[0].length) {
            if(chess[i][j] == true) return false;
            i--;
            j++;
        }
        
        return true;
    }

    public static void printNQueens(boolean[][] chess, String qsf, int row) {
        
        if(row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }
        
        for(int col=0;col<chess[0].length;col++) {
            if(isQueenSafe(chess,row,col) == true) {
                chess[row][col] = true; //edge pre
                //call
                printNQueens(chess,qsf + row + "-" + col + ", ",row + 1);
                chess[row][col] = false; //edge post
            }
        }
        
    }
}