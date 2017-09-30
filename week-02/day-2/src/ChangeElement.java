public class ChangeElement {
    public static void main(String[] args) {
        //- Create an array variable named `s`
        //  with the following content: `[1, 2, 3, 8, 5, 6]`
        // - Change the 8 to 4
        //- Print the fourth element

        int[] s = {1, 2, 3, 8, 5, 6};
        s[3] = 4;
        System.out.println(s[3]);

        for (int i : s) {
            if (s[i - 1] == 4) {
                s[i -1] = 123;
            }
        }
        for (int i : s) {
            System.out.println(i);
        }




    }
}
