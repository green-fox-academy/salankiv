import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial

        System.out.println("Give me a number:");
        Scanner myScanner = new Scanner(System.in);
        int userNumber = myScanner.nextInt();

        if (userNumber == 0) {
            System.out.println("Bigger than 0, please");
        } else {
            System.out.println(factorio(userNumber));
        }
    }

    public static int factorio(int input) {
        int factor = 1;
        for (int i = 1; i <= input; i++) {
            factor = factor * i;
        }
        return factor;
    }

}
