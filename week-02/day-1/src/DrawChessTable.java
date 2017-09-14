public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        String row = "";

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (i % 2 == 1 && j % 2 == 1) {
                    row = row + "%";
                } else if (i % 2 == 0 && j % 2 == 1) {
                    row = row + " ";
                } else if (i % 2 == 1 && j % 2 == 0) {
                    row = row + " ";
                } else {
                    row = row + "%";
                }
            }
            System.out.println(row);
            row = "";
        }
    }
}
