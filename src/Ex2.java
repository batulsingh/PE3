import java.util.Scanner;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows of matrix :");
        int numOfRows = sc.nextInt();

        System.out.print("Enter number of columns of matrix :");
        int numOfColumns = sc.nextInt();

        int[][] matrix1 = new int[numOfRows][numOfColumns];
        int[][] matrix2 = new int[numOfRows][numOfColumns];

        System.out.print("Enter elements of first matrix :");
        String matrixOneElements = sc.nextLine();

        System.out.print("Enter elements of second matrix :");
        String matrixTwoElements = sc.nextLine();

        String[] matrix1StringArray = matrixOneElements.split(" ");
        String[] matrix2StringArray = matrixTwoElements.split(" ");

    }
}
