package FindMaxElementOf2DArray;
import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows number");
        int rows = scanner.nextInt();
        System.out.println("Enter the columns number");
        int columns = scanner.nextInt();
        double[][] matrix = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value of row " + (i + 1) + ", column " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        double max = matrix[0][0];
        int maxRow = 0;
        int maxColumn = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        System.out.println("The biggest element of matrix: " + max + " at row " + maxRow + " and column " + maxColumn);
    }
}
