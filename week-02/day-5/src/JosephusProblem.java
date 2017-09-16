import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me the number of players:");
        int numberOfPlayers = myScanner.nextInt();

        ArrayList<Integer> livingPlayers = new ArrayList<>();

        for (int i = 0; i < numberOfPlayers; i++) {
            livingPlayers.add(i + 1);
        }

        System.out.println(livingPlayers);

    /*    int sum = 0;

        for (int i = 0; i < livingPlayers.size(); i++) {
            sum = sum + livingPlayers.get(i);
        }
*/
        int j = 0;
        while (livingPlayers.size() > 1) {
            for (int i = j; i < livingPlayers.size() - 1; i += 2) {
                livingPlayers.set(i + 1, 0);
            }

            if (livingPlayers.get(livingPlayers.size() - 1) == 0) {
                j = 0;
            } else {
                j = -1;
            }

            for (int i = 0; i < livingPlayers.size(); i++) {
                livingPlayers.remove(Integer.valueOf(0));
            }
/*
            sum = 0;
            for (int k = 0; k < livingPlayers.size(); k++) {
                sum = sum + livingPlayers.get(k);

            }
*/
        }
        System.out.println(livingPlayers);
    }
}
