public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        int[] aj = {3, 4, 5, 6, 7};

        for (int i = 0; i < 2; i++) {
            int swapper = aj[i];
            aj[i] = aj[4 - i];
            aj[4 - i] = swapper;
        }

        for (int j = 0; j <= aj.length -1; j++) {
            System.out.print(aj[j] + ", ");
        }
    }
}
