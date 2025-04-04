
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int rowA, colA, rowB, colB;

    while (true) {
        System.out.print("Enter the row of first matrix: ");
        if (scanner.hasNextInt()) {
            rowA = scanner.nextInt();
            break;
        } else {
            System.out.println("Invalid input! Please enter a number.");
            scanner.next();
        }
    }

    while (true) {
        System.out.print("Enter the column of first matrix: ");
        if (scanner.hasNextInt()) {
            colA = scanner.nextInt();
            break;
        } else {
            System.out.println("Invalid input! Please enter a number.");
            scanner.next();
        }
    }

    while (true) {
        System.out.print("Enter the row of second matrix: ");
        if (scanner.hasNextInt()) {
            rowB = scanner.nextInt();
            break;
        } else {
            System.out.println("Invalid input! Please enter a number.");
            scanner.next();
        }
    }

    while (true) {
        System.out.print("Enter the column of second matrix: ");
        if (scanner.hasNextInt()) {
            colB = scanner.nextInt();
            break;
        } else {
            System.out.println("Invalid input! Please enter a number.");
            scanner.next();
        }
    }

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

// Example


// 3 5 7
// 4 9 8

// 3 5
// 3 2
// 1 4