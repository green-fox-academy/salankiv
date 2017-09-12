public class DoubleItems {
    public static void main(String[] args) {

        // - Create an array variable named `ag`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array

        int[] ag = {3, 4, 5, 6, 7};

        for (int i = 0; i <= ag.length - 1; i++) {
            ag[i] = ag [i] * 2;
        }

        for (int j = 0; j <= ag.length - 1; j++) {
            System.out.println(ag[j]);
        }
    }
}
