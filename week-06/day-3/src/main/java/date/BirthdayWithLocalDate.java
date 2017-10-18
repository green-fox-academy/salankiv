package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthdayWithLocalDate implements BirthdayCalculator<LocalDate> {

	@Override
	public LocalDate parseDate(String str) {
		return LocalDate.parse(str);
	}

	@Override
	public String printMonthAndDay(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM. dd.");
		return date.format(formatter);
	}

	@Override
	public boolean isAnniversaryToday(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM. dd.");
		return LocalDate.now().format(formatter).equals(date.format(formatter));
	}

	@Override
	public int calculateAgeInYears(LocalDate birthday) {
		return LocalDate.now().getYear() - birthday.getYear();
	}

	@Override
	public int calculateDaysToNextAnniversary(LocalDate date) {
		if (date.equals(LocalDate.now())) {
			return  0;
		} else if (LocalDate.now().getDayOfYear() < date.getDayOfYear()) {
			return date.getDayOfYear() - LocalDate.now().getDayOfYear();
		} else return (365 - LocalDate.now().getDayOfYear()) + date.getDayOfYear();
		// TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
	}

	public static void main(String[] args) {
		new BirthdayWithLocalDate().run();
	}

	private void run() {

		print("Birthday with java.util.Date.");
		String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

		LocalDate birthdayDate = parseDate(birthdayStr);
		print("Your birthday: " + printMonthAndDay(birthdayDate));

		if (isAnniversaryToday(birthdayDate)) {
			int ageInYears = calculateAgeInYears(birthdayDate);
			print("Congratulations! Today is your " + ageInYears + "th birthday!");
		} else {
			int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
			print("You have to wait only " + daysLeft + " days for your next birthday.");
		}
	}

	private void print(String line) {
		System.out.println(line);
	}

	private String readInput(String message) {
		System.out.print(message + ": ");
		return input.nextLine();
	}

	private final Scanner input = new Scanner(System.in, "UTF-8");
}
