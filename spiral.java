import java.util.*;
public class spiral {
    public static void spiralMatrix(int Matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=Matrix.length-1;
        int endCol=Matrix[0].length-1;
         
        while(startRow<=endRow && startCol<=endCol){

            //top
            for(int j=startCol;j<endCol;j++){
                System.out.print(Matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow;i<endRow;i++){
                System.out.print(Matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol;j>startCol;j--){
                System.out.print(Matrix[endRow][j]+" ");
                if(startRow==endRow){
                    break;
                }
            }
            //left
            for(int i=endRow;i>startRow;i--){
                System.out.print(Matrix[i][startCol]+" ");
                if(startCol==endCol){
                    break;
                }
            
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String args[]){
       int Matrix[][]={{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
       spiralMatrix(Matrix);
    }
}
