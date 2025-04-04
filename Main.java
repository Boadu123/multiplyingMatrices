
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the row of first matrix");
        int rowA = scanner.nextInt();

        System.out.println("Enter the column of first matrix");
        int colA = scanner.nextInt();

        System.out.println("Enter the row of second matrix");
        int rowB = scanner.nextInt();

        System.out.println("Enter the column of second matrix");
        int colB = scanner.nextInt();

        if(colA != rowB){
            System.out.println("The Matrices cannot be multiplied");
        }

        // Matrices to be used
        int[][] matrixA = new int[rowA][colA];
        int[][] matrixB = new int[rowB][colB];

        System.out.println("Enter the matrix details for first Matrix");
        inputMatrix(scanner, matrixA);

        System.out.println("Enter the matrix details for second Matrix");
        inputMatrix(scanner, matrixB);

        // Multiply the matrices

        int[][] finalMatrix = multiplyMatrix(matrixA, matrixB);

        // Show final matrices to the user
        System.out.println("The final multiplied Matrix is ");
        displayMatrix(finalMatrix);

        scanner.close();
    }

    private static void inputMatrix(Scanner scanner, int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static int[][] multiplyMatrix(int[][] A, int[][] B){
        int rowsA = A.length, colsB = B[0].length, colsA = A[0].length;
        int[][] multipliedMatrix = new int[rowsA][colsB];

        for(int i=0; i<rowsA; i++){
            for(int j=0; j<colsB; j++){
                for(int k=0; k<colsA; k++){
                    multipliedMatrix[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return multipliedMatrix;
    }

    private static void displayMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int value : row){
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}