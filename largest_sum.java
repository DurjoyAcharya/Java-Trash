package Algorithoms;

/**
 *
 * @author Durjoy_Acharya<da-durjoy@outlook.com>
 */
public class largest_sum {
    public static void main(String args[]){
    int[][] matrix={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int maxRow = 0;
    int indexOfMaxRow = 0;
// Get sum of the first row in maxRow
    for (int column = 0; column < matrix[0].length; column++) {
    maxRow += matrix[0][column];
}
    for (int row = 1; row < matrix.length; row++) {
    int totalOfThisRow = 0;
    for (int column = 0; column < matrix[row].length; column++)
    totalOfThisRow += matrix[row][column];
    if (totalOfThisRow > maxRow) {
    maxRow = totalOfThisRow;
    indexOfMaxRow = row;
}
}
System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
    
    
    }
}
