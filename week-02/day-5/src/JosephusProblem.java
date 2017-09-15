import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me the number of players:");
        int numberOfPlayers = myScanner.nextInt();

        ArrayList<Integer> statusOfPlayers = new ArrayList<>();

        for (int i = 0; i < numberOfPlayers; i++) {
            statusOfPlayers.add(i + 1);
        }

        int sumOfLiving = 0;

        for (int i = 0; i < numberOfPlayers; i++) {
            sumOfLiving = sumOfLiving + statusOfPlayers.get(i);
        }

        System.out.println(sumOfLiving);

        while (sumOfLiving > statusOfPlayers.get(numberOfPlayers - 1)) {

            if (numberOfPlayers % 2 == 0) {
                for (int i = 0; i < numberOfPlayers; i += 2) {
                    statusOfPlayers.set(i, 0);
                }
            }
            sumOfLiving = 0;
            for (int i = 0; i < numberOfPlayers; i++) {
                sumOfLiving = sumOfLiving + statusOfPlayers.get(i);
            }
        }

        System.out.println(statusOfPlayers);
    }
}
