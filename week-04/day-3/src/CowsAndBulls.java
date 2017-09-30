import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CowsAndBulls {
	int[] numberToGuess;
	int[] guessedNumber;
	String userInput;
	int cows;
	int bulls;
	int counterOfGuesses;
	String state;
	Scanner scanner = new Scanner(System.in);

	public CowsAndBulls(){
		state = "playing";
	}

	public void start() {
		System.out.println("Let's start!");
		generateDigits();
		newGuess();
	}

	public void generateDigits() {
		numberToGuess = new int[4];
		for (int i = 0; i < 4; i++) {
			numberToGuess[i] = (int) Math.round(Math.random() * 9);
		}
		if (numberToGuess[0] == 0) generateDigits();
	}

	public void newGuess() {
		System.out.println("Give a try:");
		userInput = scanner.next();
		guessedNumber = new int[4];
		for (int i = 0; i < userInput.length(); i++) {
			guessedNumber[i] = Integer.valueOf(userInput.substring(i, i + 1));
		}
		counterOfGuesses++;
		checkGuess(guessedNumber);
	}

	public void checkGuess(int[] guessedNumber) {
		cows = checkCows(guessedNumber);
		if (cows == 4) {
			System.out.println("Congrats! Game is over.");
			state = "finished";
		} else {
			bulls = checkBulls(guessedNumber);
			System.out.println("You have " + cows + " cows and " + bulls + " bulls");
			newGuess();
		}
	}

	public int checkBulls(int[] guessedNumber) {
		bulls = 0;
		Map<Integer, Integer> digitMap = new HashMap<>();
		for (int i = 0; i < 4; i++) {
			if (!digitMap.containsKey(guessedNumber[i])) {
				digitMap.put(guessedNumber[i], 1);
			} else {
				digitMap.put(guessedNumber[i], (digitMap.get(guessedNumber[i]) + 1));
			}
		}
		for (int i = 0; i < 4; i++) {
			if (digitMap.containsKey(numberToGuess[i]) && digitMap.get(numberToGuess[i]) > 0) {
				bulls++;
				digitMap.put(numberToGuess[i], digitMap.get(numberToGuess[i]) - 1);
			}
		}
		return bulls - cows;
	}

	public int checkCows(int[] guessedNumber) {
		cows = 0;
		for (int i = 0; i < 4; i++) {
			if (guessedNumber[i] == numberToGuess[i]) {
				cows++;
			}
		}
		return cows;
	}

	public static void main(String[] args) {
		CowsAndBulls newGame = new CowsAndBulls();
		newGame.start();
	}
}
