package Class08_Arrays;

/*
 Two-dimensional arrays are arrays of arrays.
 They can be thought of as a table or a grid, where each element is accessed using two indices: one for the row and one for the column.
 In Java, you can declare and initialize a two-dimensional array as follows:

 // Declaration and initialization of a 2D array
    int[][] matrix = {
    {1, 2, 3}, {4, 5, 6},{7, 8, 9}
    };
 */

public class TwoDimensionalArraysExample {
    public static void main(String[] args) {
        // Declaration and initialization of a 2D array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing elements in a 2D array
        System.out.println("Element at row 0, column 1: " + matrix[0][1]); // Output: 2
        System.out.println("Element at row 1, column 2: " + matrix[1][2]); // Output: 6
        System.out.println("Element at row 2, column 0: " + matrix[2][0]); // Output: 7

        // Iterating through a 2D array using nested loops
        System.out.println("Elements in the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
