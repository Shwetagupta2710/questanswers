public class spiralmatrix {
   public static void main(String args[]){
        int matrix1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int matrix2[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral(matrix1);
        spiral(matrix2);                
    }
   public static void spiral(int matrix[][]){
    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length-1;
    int endCol = matrix[0].length-1;
    while(startRow<=endRow && startCol<=endCol){
        //top startcol-endcol
        for(int j= startCol; j<=endCol; j++){
            System.out.print(matrix[startRow][j]+" ");
        }
        //right startrow+1-endrow
         for(int i= startRow+1; i<=endRow; i++){
            System.out.print(matrix[i][endCol]+" ");
        }
        //bottom endcol-1-startcol
         for(int j= endCol-1; j>=startCol; j--){
            if(startCol==endCol){
                break;
            }
            System.out.print(matrix[endRow][j]+" ");
        }
        //left endrow-1-startrow+1
         for(int i= endRow-1; i>=startRow+1; i--){
            System.out.print(matrix[i][startCol]+" ");
        }
        startRow++;
        endRow--;
        startCol++;
        endCol--;
        

    }
    System.out.println();
   }
}
