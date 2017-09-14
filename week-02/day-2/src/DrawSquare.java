public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %   %
        // %   %
        // %   %
        // %   %
        // %%%%%
        //
        // The square should have as many lines as the number was

        int lines = 6;
        String symbol = "";

        for (int i = 0; i < lines -1; i++) {
            symbol = symbol + "%";
        }
        System.out.println(symbol);
        symbol = "%";
        String whiteSpace = "";

        for (int i = 0; i < lines -2; i++) {
            for (int j = 0; j < lines - 3; j++) {
                whiteSpace = whiteSpace + " ";
            }
            System.out.println(symbol + whiteSpace + "%");
            whiteSpace = "";
        }

        symbol = "";
        for (int i = 0; i < lines -1; i++) {
            symbol = symbol + "%";
        }
        System.out.println(symbol);
    }
}
