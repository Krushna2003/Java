import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter rows and columns of first matrix: ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();

        // Check if multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Number of columns in first matrix must be equal to number of rows in second matrix.");
        } else {
            // Input matrix elements
            int[][] matrix1 = new int[rows1][cols1];
            int[][] matrix2 = new int[rows2][cols2];
            int[][] result = new int[rows1][cols2];

            System.out.println("Enter elements of first matrix:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter elements of second matrix:");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            // Perform matrix multiplication
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    for (int k = 0; k < cols1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            // Display result matrix
            System.out.println("Resulting matrix:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}