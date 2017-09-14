public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        int lines = 7;
        int Half = 3;
        String whiteSpace = "";
        String asterix = "";

        for (int i = 0; i < Half; i++) {
            for (int j = 0; j < Half - i; j++) {
                whiteSpace = whiteSpace + " ";
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                asterix = asterix + "*";
            }
            System.out.println(whiteSpace + asterix);
            whiteSpace = "";
            asterix = "";
        }

        for (int i = 0; i < lines; i++) {
            asterix = asterix + "*";
        }
        System.out.println(asterix);
        asterix = "";

        for (int i = 0; i < Half; i++) {
            for (int j = 0; j <= i; j++) {
                whiteSpace = whiteSpace + " ";
            }
            for (int j = 0; j < lines - (i * 2 + 2); j++) {
                asterix = asterix + "*";
            }
            System.out.println(whiteSpace + asterix);
            whiteSpace = "";
            asterix = "";
        }
    }
}
