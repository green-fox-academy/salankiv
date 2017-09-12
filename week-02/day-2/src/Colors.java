public class Colors {
    public static void main(String[] args) {
        // - Create a two dimensional array
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`

        String[] green = {"lime", "forest green", "olive", "pale green", "spring green"};
        String[] red = {"orange", "red", "red", "tomato"};
        String[] pink = {"orchid", "violet", "pink", "hot pink"};

        int maxLength = 0;
        int greenLength = green.length;
        int redLength = red.length;
        int pinkLength = pink.length;

        if (green.length >= red.length && green.length >= pink.length) {
            maxLength = greenLength;
        } else if (red.length >= green.length && red.length >= pink.length) {
            maxLength = redLength;
        } else {
            maxLength = pinkLength;
        }

        String[][] colorsArray = new String[3][maxLength];

        System.arraycopy(green, 0, colorsArray[0], 0, greenLength);
        System.arraycopy(red, 0, colorsArray[1], 0, redLength);
        System.arraycopy(pink, 0, colorsArray[2], 0, pinkLength);

        int i = 0;
        while (i < 3)  {
            if (i == 0) {
                for (int j = 0; j <= greenLength - 1; j++) {
                    System.out.print(colorsArray[i][j] + ",");
                }
            } else if (i == 1) {
                for (int j = 0; j <= redLength - 1; j++) {
                    System.out.print(colorsArray[i][j] + ",");
                }
            } else {
                for (int j = 0; j <= pinkLength - 1; j++) {
                    System.out.print(colorsArray[i][j] + ",");
                }
            }

            System.out.println();
            i += 1;
        }
    }
}
