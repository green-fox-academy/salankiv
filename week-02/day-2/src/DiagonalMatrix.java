import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        System.out.println("Give me a number:");
        Scanner myScanner = new Scanner(System.in);
        int userNumber = myScanner.nextInt();

        String[][] matrix = new String[userNumber][userNumber];

        for (int row = 0; row <= userNumber -1; row++) {
            for (int col = 0; col <= userNumber - 1; col++) {
                if (row == col) {
                    matrix[row][col] = "1";
                } else {
                    matrix[row][col] = "0";
                }
            }
        }

        for (int i = 0; i <= matrix.length - 1; i++) {
               for (int j = 0; j <= matrix.length - 1; j++) {
               System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
